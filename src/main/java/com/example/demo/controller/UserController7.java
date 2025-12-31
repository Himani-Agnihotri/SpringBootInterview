package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@RequestMapping("/api")
public class UserController7 {

    @GetMapping("/himani")
    public ResponseEntity<String> getUser(){
        throw new CustomException(HttpStatus.BAD_REQUEST,"Himani Agnihotri");
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleCustomException(CustomException exception){
        return new ResponseEntity<>("Local", exception.getStatus());
    }

}*/
