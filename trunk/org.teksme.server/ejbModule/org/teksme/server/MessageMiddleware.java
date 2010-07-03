package org.teksme.server;

import java.io.Serializable;

public interface MessageMiddleware extends Serializable{

	public void setInboundMessageNotification();
	
	public void setOutboundMessageNotification();
	
	public void setQueueSendingNotification();
	
	public void getService();
	
	public void init();
	
}
