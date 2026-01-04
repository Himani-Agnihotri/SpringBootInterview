package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController{

    @GetMapping("/{id}")
    public String getProduct(@PathVariable String id) throws InterruptedException {
        Thread.sleep(5000);
        return "Product: "+ id;
    }
}