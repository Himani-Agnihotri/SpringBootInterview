package com.example.demo.controller;

import com.example.demo.service.CustomRateLimiter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/{id}")
    @CustomRateLimiter(limit = 2, windowsInSeconds = 5)
    public String getOrders(String id){
        return "orders";
    }

}
