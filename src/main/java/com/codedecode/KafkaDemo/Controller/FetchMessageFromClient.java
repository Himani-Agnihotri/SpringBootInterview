package com.codedecode.KafkaDemo.Controller;

import com.codedecode.KafkaDemo.service.KafkaProducer;
import org.apache.kafka.clients.KafkaClient;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class FetchMessageFromClient {

    @Autowired
    KafkaProducer producer;

    @GetMapping("/getMessage")
    public void producerMsg(@RequestParam("message") String message){
        producer.sendMsg(message);
    }
}
