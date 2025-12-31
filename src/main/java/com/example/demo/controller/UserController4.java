package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import com.example.demo.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Objects;

/*@RestController
@RequestMapping(value = "/api4")
public class UserController4 {

    @GetMapping("/getResult")
    public ResponseEntity<String> getResponse(){
        throw new CustomException(HttpStatus.BAD_REQUEST,"Volla");
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<Object> handleCustomException(CustomException exception){
        ErrorResponse errorResponse = new ErrorResponse(new Date(), exception.getMessage(), exception.getStatus().value());
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }

}*/
