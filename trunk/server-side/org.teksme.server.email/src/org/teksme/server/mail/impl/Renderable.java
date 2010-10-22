package org.teksme.server.mail.impl;

import java.util.Date;

import javax.mail.Address;


public interface Renderable {
    
	Attachment getAttachment(int i);

    int getAttachmentCount();

    String getBodytext();

    String getSubject();
    
    Date getSentDate();
    
    Address[] getFrom();
    
}
