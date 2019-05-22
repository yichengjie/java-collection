package com.yicj.activemq.consume;

import javax.jms.JMSException;
import org.springframework.stereotype.Component;

import com.yicj.activemq.common.MessagePojo;

@Component
public class MqConsumer{

    public void handleMessage(MessagePojo msg) throws JMSException {
        System.out.println("handleMessage:" + msg.toString());
    }

}
