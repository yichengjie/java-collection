package com.yicj.activemq.common;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.support.converter.MessageConverter ;
import org.springframework.jms.support.converter.MessageConversionException;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

//@Component("messageConverter")
public class MqMessageConverter implements MessageConverter {

    private static final Logger LOGGER = LoggerFactory.getLogger(MqMessageConverter.class);

    public Object fromMessage(Message message) throws JMSException, MessageConversionException {
        LOGGER.info("从mq获得message, message内容：" + message);
        JSONObject jsonRoot = (JSONObject) JSON.parse(message.getStringProperty("obj"));
        JSONObject jsonObj = JSONObject.parseObject(jsonRoot.getString("value"));
        MessagePojo info = JSON.toJavaObject(jsonObj.getJSONObject("body"), MessagePojo.class);
        return info;
    }

    public Message toMessage(Object obj, Session session) throws JMSException, MessageConversionException {
        LOGGER.info("往mq插入message, message内容：" + obj);
        JSONObject jsonRoot = new JSONObject();
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("body", obj);
        //////////////////////////////////////
        jsonRoot.put("value", jsonObj.toJSONString());
        Message message = session.createMapMessage();
        message.setObjectProperty("obj", jsonRoot.toJSONString());
        return message;
    }
}
