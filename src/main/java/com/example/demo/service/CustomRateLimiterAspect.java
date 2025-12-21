package com.example.demo.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

@Aspect
@Component
public class CustomRateLimiterAspect {

    public ConcurrentHashMap<String,Counter> hashMap= new ConcurrentHashMap<>();

    @Around("@annotation(com.example.demo.service.CustomRateLimiter)")
    public String customRateLimiter(ProceedingJoinPoint jp, CustomRateLimiter rateLimiter) throws Throwable {
        String key = jp.getSignature().toShortString();
        Counter counter = hashMap.computeIfAbsent(key, k -> new Counter());
        if(!counter.allow(rateLimiter.limit(), rateLimiter.windowsInSeconds())){
          throw new ResponseStatusException(HttpStatus.TOO_MANY_REQUESTS,"Rate Limit Exceeded");
        }
        return (String) jp.proceed();
    }

    static class Counter{
        long timeStart = System.currentTimeMillis();
        int count = 0;
        synchronized boolean allow(long start , long end){
            long now = System.currentTimeMillis();
            if(now - timeStart > end * 1000L){
               timeStart=now;
               count=0;
            }
            return ++count<=start;
        }
    }
}
