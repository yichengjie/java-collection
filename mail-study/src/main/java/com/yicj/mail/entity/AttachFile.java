package com.yicj.mail.entity;

public class AttachFile extends MailType{

	private String fileName ;
	private String filePath ;
	
	@Override
	public char getType() {
		return MailType.TYPE_ATTACH;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
