package com.yicj.activemq.demo02;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;

public class TopicConsumeTest01 {
	
	public static void main(String[] args) throws Exception {
		TopicConsumeTest01 consume = new TopicConsumeTest01() ;
		consume.testTopicConsumer();
	}
	
	public void testTopicConsumer() throws Exception {
		// 1、创建工厂连接对象，需要制定ip和端口号
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://127.0.0.1:61616");
		// 2、使用连接工厂创建一个连接对象
		Connection connection = connectionFactory.createConnection();
		// 3、开启连接
		connection.start();
		// 4、使用连接对象创建会话（session）对象
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		// 5、使用会话对象创建目标对象，包含queue和topic（一对一和一对多）
		Topic topic = session.createTopic("test-topic");
		// 6、使用会话对象创建生产者对象
		MessageConsumer consumer = session.createConsumer(topic);
		// 7、向consumer对象中设置一个messageListener对象，用来接收消息
		consumer.setMessageListener(new MessageListener() {

			@Override
			public void onMessage(Message message) {
				// TODO Auto-generated method stub
				if (message instanceof TextMessage) {
					TextMessage textMessage = (TextMessage) message;
					try {
						System.out.println(textMessage.getText());
					} catch (JMSException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		// 8、程序等待接收用户消息
		System.in.read();
		// 9、关闭资源
		consumer.close();
		session.close();
		connection.close();
	}
}
