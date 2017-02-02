package com.pgrabarczyk.spring.integration.example.service.activator;

import org.springframework.messaging.Message;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServiceActivator {
    
    public Message<String> method(Message<String> message) {
	log.debug("Here could be any magic logic");
	return message;
    }
}
