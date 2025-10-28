package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value="/api")
public class UserController9 {

    @GetMapping(path="/get-user")
    public ResponseEntity<?> getUser(){
        throw new CustomException(HttpStatus.INTERNAL_SERVER_ERROR,"UserId is missing");
    }

    @ExceptionHandler(CustomException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST,reason="Invalid Request Passed")
    public void handleCustomException(CustomException ex, HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.FORBIDDEN.value(),"you are not authorized");
    }

}
