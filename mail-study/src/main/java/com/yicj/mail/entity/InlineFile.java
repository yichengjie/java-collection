package com.yicj.mail.entity;
public class InlineFile extends MailType{
    private String filePath;
    private String cid;
    @Override
    public char getType() {
        return MailType.TYPE_FILE;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
    
}