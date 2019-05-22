package com.yicj.activemq.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.yicj.activemq.common.MessagePojo;

import java.io.IOException;

@Component
public class App {
    public static final String DEFAULT_CONFIG_LOCATION = "/spring-produce.xml";
    @Autowired
    private MqProducer mqProducer;
    /**
     * 程序入口
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
    	ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext(DEFAULT_CONFIG_LOCATION);
        App app = (App) context.getBean("app");
        app.run(args);
        context.close();
    }

    public void run(String[] args) {
        MessagePojo msg = new MessagePojo();
        msg.setTitle("测试标题");
        msg.setContent("测试内容");
        mqProducer.sendMsg(msg);

        System.exit(0);
    }
}