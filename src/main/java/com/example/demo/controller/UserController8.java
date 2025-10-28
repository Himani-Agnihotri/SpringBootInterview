package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import com.example.demo.exception.CustomException1;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class UserController8 {

    @GetMapping(path="/get-user")
    public ResponseEntity<?> getUser(){
        throw new CustomException(HttpStatus.INTERNAL_SERVER_ERROR,"UserId is missing");
    }

    @ExceptionHandler(CustomException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST,reason="Invalid Request Passed")
    public ResponseEntity<Object> handleCustomException(CustomException ex){
        return new ResponseEntity<>("you are not authorized", HttpStatus.FORBIDDEN);
    }

}
