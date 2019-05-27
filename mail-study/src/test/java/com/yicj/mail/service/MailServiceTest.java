package com.yicj.mail.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试  
@ContextConfiguration(locations={"classpath:applicationContext.xml"}) //加载配置文件   
public class MailServiceTest {
	
	@Autowired
	private IMailService mailService ;
	
	@Test
	public void testSendMail() throws Exception {
		String to = "626659321@qq.com" ;
		String subject = "测试主题" ;
		String content = "测试邮件内容" ;
		mailService.sendSimpleMail(to, subject, content);
	}
}
