package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api1/")
public class UserController1 {

    @GetMapping(path="/getUser")
    public String getUser(){
        throw new CustomException(HttpStatus.BAD_REQUEST,"Bad Request");
    }

}
