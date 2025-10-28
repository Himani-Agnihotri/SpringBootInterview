package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserController7 {
    @GetMapping(path="/get-user")
    public ResponseEntity<?> getUser(){
        throw new CustomException(HttpStatus.BAD_REQUEST,"UserId is missing");
    }
}
