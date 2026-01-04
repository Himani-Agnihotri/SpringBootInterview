package com.example.demo.service;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class OrderService{

    @Autowired
    RestTemplate restTemplate;

    @Bulkhead(name="productService",type = Bulkhead.Type.THREADPOOL,fallbackMethod = "productServiceFallback")
    public CompletableFuture<String> invokeProductAPI(@PathVariable String id){
        System.out.println("Thread Name is: "+ Thread.currentThread().getName());
        String url = "http://localhost:8082/products/" + id;
        String response = restTemplate.getForObject(url,String.class);
        return CompletableFuture.completedFuture("Response from Product API :" +response);
    }

    public CompletableFuture<String> productServiceFallback(String id, Throwable t){
        System.out.println("Product Service is busy");
        return CompletableFuture.completedFuture("Product Service is busy");
    }
}

