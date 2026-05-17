package com.example.demo.controller;

import com.example.demo.config.FirstNamePropertyEditor;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class SampleController {

    @InitBinder
    protected void initBinder(DataBinder binder){
        binder.registerCustomEditor(String.class, "firstName", new FirstNamePropertyEditor());
    }

    @GetMapping(path = "/first")
    public String getUserDetails(@RequestParam(name="firstName") String firstName){
        return firstName;
    }

}
