package com.example.demo.service;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Bulkhead(name="productService",type = Bulkhead.Type.SEMAPHORE,fallbackMethod = "productFallback")
    public String invokeProductAPI(String id){
        String url =  "http://localhost:8082/products/" + id;
        String response = restTemplate.getForObject(url, String.class);
        return "Response from Product API: " + response;
    }

    public String productFallback(String id, Throwable t){
        return "Too Many Concurrent Requests";
    }
}
