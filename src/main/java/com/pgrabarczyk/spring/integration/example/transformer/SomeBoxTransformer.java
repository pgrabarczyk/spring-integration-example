package com.pgrabarczyk.spring.integration.example.transformer;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.transformer.Transformer;
import org.springframework.messaging.Message;

import com.pgrabarczyk.spring.integration.example.model.SomeBox;

public class SomeBoxTransformer implements Transformer {

    @Override
    public Message<?> transform(Message<?> message) {
	return MessageBuilder.withPayload(new SomeBox(message.getPayload())).build();
    }

}
