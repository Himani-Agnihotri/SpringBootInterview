package com.codedecode.KafkaDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer{

	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;

	public void sendMsg(String message){
		kafkaTemplate.send("codeDecode_topic",message);
	}
}