package com.example.demo.controller;

import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/orders")
public class OrderController{

    @Autowired
    OrderService orderService;

    @GetMapping("/{id}")
    public CompletableFuture<String> getOrders(@PathVariable String id){
        return orderService.invokeProductAPI(id);
    }
}
