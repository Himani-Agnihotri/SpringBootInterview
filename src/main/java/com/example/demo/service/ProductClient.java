package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductClient {

    private final RestTemplate restTemplate;

    public ProductClient(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    public String getProductById(String id){
        String url = "https://jsonplaceholder.typicode.com/posts/" + id;
        return restTemplate.getForObject(url,String.class);
    }

}
