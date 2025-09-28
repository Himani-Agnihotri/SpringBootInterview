package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Async("myThreadPoolExecutor")
    public void asyncMethodTest(){
        System.out.println("Inside async method: "+ Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch (Exception ex){

        }
    }
}
