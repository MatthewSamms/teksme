package org.teksme.server.comm;

import java.io.Serializable;

public interface IMessageMiddleware extends Serializable{

	public void setInboundMessageNotification();
	
	public void setOutboundMessageNotification();
	
	public void setQueueSendingNotification();
	
	public void getService();
	
	public void init();
	
}
