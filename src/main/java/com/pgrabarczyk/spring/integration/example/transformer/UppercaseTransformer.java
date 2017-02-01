package com.pgrabarczyk.spring.integration.example.transformer;

import org.springframework.integration.transformer.Transformer;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

@Component
public class UppercaseTransformer implements Transformer {

    @Override
    public Message<?> transform(Message<?> message) {
	if (message.getPayload() instanceof String) {
	    String transformedMessage = message.getPayload().toString().toUpperCase();
	    return new Message<String>() {

		@Override
		public String getPayload() {
		    return transformedMessage;
		}

		@Override
		public MessageHeaders getHeaders() {
		    return message.getHeaders();
		}

	    };
	}

	throw new IllegalArgumentException("Payload is not String");
    }

}
