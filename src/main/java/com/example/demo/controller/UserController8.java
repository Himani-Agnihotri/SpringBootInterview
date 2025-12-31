package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import com.example.demo.exception.CustomException1;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*@RestController
@RequestMapping(value="/api8")
public class UserController8 {

    @GetMapping(path="/getuser")
    public ResponseEntity<?> getUser(){
        throw new CustomException("UserId is missing");
    }

    @ExceptionHandler(CustomException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST , reason = "Hi")
    public ResponseEntity<String> handleCustomException(CustomException ex){
        return new ResponseEntity<>("you are not authorized", HttpStatus.FORBIDDEN);
    }

}*/
