package com.yicj.mail.service;

import java.io.IOException;

import com.yicj.mail.entity.MailMessage;
import com.yicj.mail.entity.MailType;

public interface IMailService {

	void sendSimpleMail(String to, String subject, String content);

	void sendHtmlMail(String to, String subject, String content);

	void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);

	public void setMailMessage(MailMessage mailMessage);

	public void sendHtml(String content, MailType... mailTypes) throws IOException;
}
