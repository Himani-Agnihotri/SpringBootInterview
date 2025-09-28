package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Async
    public void asyncMethodTest(){
        System.out.println("Inside async method: "+ Thread.currentThread().getName());
    }
}
