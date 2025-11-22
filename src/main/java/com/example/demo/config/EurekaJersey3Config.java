package com.example.demo.config;

import com.netflix.discovery.shared.transport.jersey.TransportClientFactories;
import com.netflix.discovery.shared.transport.jersey3.Jersey3TransportClientFactories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EurekaJersey3Config {

    @Bean
    public TransportClientFactories<?> jersey3TransportClientFactories() {
        return new Jersey3TransportClientFactories();
    }
}
