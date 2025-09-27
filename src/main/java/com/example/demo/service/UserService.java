package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Async
    public void asyncMethodTest(){
        System.out.println("Inside asyncMethodTest: "+ Thread.currentThread().getName());
    }
}
