package com.yicj.activemq.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.yicj.activemq.common.MessagePojo;

@Component
public class MqProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMsg(MessagePojo info) {
        try {
            jmsTemplate.convertAndSend(info);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}