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

/*@RestController
@RequestMapping("/api6")
public class UserController6{

    @RequestMapping("/getDetails")
    public ResponseEntity<String> getUserDetails(){
        throw new CustomException(HttpStatus.BAD_REQUEST, "Got User Details");
    }

    @ExceptionHandler(CustomException.class)
    public void handleCustomException(HttpServletResponse response, CustomException exception) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value(), exception.getMessage());
    }
}*/