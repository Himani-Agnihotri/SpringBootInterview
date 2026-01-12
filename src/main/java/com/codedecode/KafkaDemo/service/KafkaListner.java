package com.codedecode.KafkaDemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
class KafkaListner{

	@KafkaListener(topics = "codeDecode_topic", groupId = "codeDecode1")
	public void listenToTopic(String message){
		System.out.println("The message received is: "+ message);
	}

}
