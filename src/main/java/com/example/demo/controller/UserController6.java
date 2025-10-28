package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value="/api")
public class UserController6 {

    @GetMapping(path="/get-user")
    public ResponseEntity<?> getUser(){
        throw new CustomException(HttpStatus.BAD_REQUEST,"UserId is missing");
    }

    @ExceptionHandler(CustomException.class)
    public void handleCustomException(CustomException ex, HttpServletResponse response) throws IOException {
        response.sendError(ex.getStatus().value(),ex.getMessage());
    }
}
