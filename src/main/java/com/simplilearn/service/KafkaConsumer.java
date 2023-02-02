package com.simplilearn.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "simplilearn", groupId = "1")
	public void consume(String message) {
		System.out.println("Message Received :"+message);
	}
	
	@KafkaListener(topics = "simplilearn", groupId = "2")
	public void consume1(String message) {
		System.out.println("Message Received ###:"+message);
	}
}
