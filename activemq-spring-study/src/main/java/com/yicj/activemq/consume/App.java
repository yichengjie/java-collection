package com.yicj.activemq.consume;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static final String DEFAULT_CONFIG_LOCATION = "/spring-consume.xml";
	/**
     * 程序入口
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(DEFAULT_CONFIG_LOCATION);
    }
}
