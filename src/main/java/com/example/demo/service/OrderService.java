package com.example.demo.service;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ProductClient productClient;

    public OrderService(ProductClient productClient){
        this.productClient=productClient;
    }

    @RateLimiter(name="productRateLimiter",fallbackMethod = "rateLimitedFallback")
    public String invokeProductApi(String id){
        String response = productClient.getProductById(id);
        return response;
    }

    public String rateLimitedFallback(String id, Throwable t){
        return  "Rate Limit Exceeded: ";
    }

}
