package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@RequestMapping(value="/test5")
public class UserController5{

    @GetMapping("/getRes")
    public ResponseEntity<?> getResult(){
        throw new CustomException(HttpStatus.BAD_REQUEST,"Try Some Other Time");
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleCustomException(CustomException exception){
        return new ResponseEntity<>(exception.getMessage(),HttpStatus.BAD_REQUEST);
    }

}*/