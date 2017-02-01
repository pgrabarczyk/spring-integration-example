package com.pgrabarczyk.spring.integration.example.selector;

import java.io.File;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloMessageSelector implements MessageSelector {

    @Override
    public boolean accept(Message<?> message) {
	log.debug("{} got message", getClass().getSimpleName());
	if (message.getPayload() instanceof File) {
	    File file = (File) message.getPayload();
	    log.debug("File name: \"{}\"", file.getName());
	    return file.getName().startsWith("hello");
	}
	return false;
    }

}
