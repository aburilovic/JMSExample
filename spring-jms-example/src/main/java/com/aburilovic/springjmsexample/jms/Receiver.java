package com.aburilovic.springjmsexample.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;

public class Receiver {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(Receiver.class);

    private String latestMessage = null;

    @JmsListener(destination = "helloworld.q")
    public void receive(String message) {
        latestMessage = message;
        LOGGER.info("**************** received message='{}'", message);
    }

    @JmsListener(destination = "ActiveMQ.Advisory.Consumer.Queue.helloworld.q")
    public void receive2(String message) {
        latestMessage = message;
        LOGGER.info("**************** received message 2='{}'", message);
    }

    public String getLatestMessage() {
        return latestMessage;
    }
}
