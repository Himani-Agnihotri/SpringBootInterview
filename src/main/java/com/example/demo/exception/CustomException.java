package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value = HttpStatus.BAD_REQUEST,reason = "Hi")
public class CustomException extends RuntimeException {
    HttpStatus status;
    String message;

     public CustomException(HttpStatus status, String message) {
       this.status = status;
        this.message = message;
    }

    public CustomException(String message) {
        super(message);
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
