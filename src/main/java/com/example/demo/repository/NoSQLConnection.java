package com.example.demo.repository;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "nosqlconnection",value = "enabled",havingValue = "true",matchIfMissing = false)
public class NoSQLConnection {
    public NoSQLConnection() {
        System.out.println("Initialization of NoSQLConnection");
    }
}
