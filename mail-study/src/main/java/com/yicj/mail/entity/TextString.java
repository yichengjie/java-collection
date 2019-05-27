package com.yicj.mail.entity;

public class TextString extends MailType{
	
	private String text ;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public char getType() {
		return MailType.TYPE_TEXT;
	}
}
