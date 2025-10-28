package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST,reason="Invalid Request Passed")
public class CustomException1 extends RuntimeException {

    HttpStatus status;

    CustomException1(HttpStatus status, String message){
        super(message);
        this.status=status;
    }
}
