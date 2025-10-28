package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import com.example.demo.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value="/checkcontroller")
public class UserController4 {
    @GetMapping(path="/user")
    public ResponseEntity<?> getUs(){
        throw new CustomException(HttpStatus.BAD_REQUEST,"User ID is missing");
    }
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<Object> handleCustomException(CustomException ex){
        ErrorResponse errorResponse = new ErrorResponse(new Date(),ex.getMessage(),ex.getStatus().value());
        return new ResponseEntity<>(errorResponse,ex.getStatus());
    }
}
