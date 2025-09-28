package com.example.demo.controller;

import com.example.demo.service.AppConfig;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/getUserMethod")
    public String getUserMethod(){
          System.out.println("Inside getUserMethod: "+Thread.currentThread().getName());
          userService.asyncMethodTest();
          return null;
    }
}
