package com.yicj.mail.entity;
public abstract class MailType {
    public final static char TYPE_FILE ='F';
    public final static char TYPE_ATTACH ='A';
    public final static char TYPE_TEXT ='T';
    public final static char TYPE_JSON ='J';
    public abstract char getType();
}