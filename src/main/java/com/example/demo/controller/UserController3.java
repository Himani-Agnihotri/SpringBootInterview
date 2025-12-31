package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@RequestMapping(value = "/api")
public class UserController3 {

    @GetMapping(value = "/getResult")
    public ResponseEntity<?> getResponse(){
        throw new CustomException(HttpStatus.BAD_REQUEST, "Do not send bad requests");
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleBadRequestException(CustomException exception){
        return new ResponseEntity(exception.getMessage(),exception.getStatus());
    }
}*/
