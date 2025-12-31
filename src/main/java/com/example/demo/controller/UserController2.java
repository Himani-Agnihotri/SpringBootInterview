package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import com.example.demo.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/*@RestController
@RequestMapping(value="/apicheck/")
public class UserController2 {

    @GetMapping(path="/get-user")
    public ResponseEntity<?> getUser(){
        try{
            throw new CustomException(HttpStatus.BAD_REQUEST,"User ID is missing");
        }catch(CustomException exception){
            ErrorResponse errorResponse = new ErrorResponse(new Date(),exception.getMessage(),
                    exception.getStatus().value());
            return new ResponseEntity<>(errorResponse,exception.getStatus());
        }catch(Exception exception){
            ErrorResponse errorResponse = new ErrorResponse(new Date(),exception.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR.value());
            return new ResponseEntity<>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}*/
