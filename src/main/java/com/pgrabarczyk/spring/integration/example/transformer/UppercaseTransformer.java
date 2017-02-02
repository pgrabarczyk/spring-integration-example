package com.pgrabarczyk.spring.integration.example.transformer;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.transformer.Transformer;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class UppercaseTransformer implements Transformer {

    @Override
    public Message<?> transform(Message<?> message) {
	if (message.getPayload() instanceof String) {
	    String transformedMessage = message.getPayload().toString().toUpperCase();
	    return MessageBuilder.withPayload(transformedMessage).build();
	}

	throw new IllegalArgumentException("Payload is not String");
    }

}
