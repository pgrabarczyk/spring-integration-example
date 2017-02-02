package com.pgrabarczyk.spring.integration.example.router;

import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.router.AbstractMessageRouter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class AlphaNumericRouter extends AbstractMessageRouter {

    @Autowired
    private MessageChannel outChannel;

    @Autowired
    private MessageChannel logChannel;

    @Override
    protected Collection<MessageChannel> determineTargetChannels(Message<?> message) {
	String payload = message.getPayload().toString();
	if (StringUtils.isNumeric(payload))
	    return Arrays.asList(outChannel);

	return Arrays.asList(logChannel);
    }
}
