package com.yicj.mail.entity;

public class JsonTable extends MailType{
	
	private String title ;
	private String data ;
	
	@Override
	public char getType() {
		return MailType.TYPE_JSON;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
