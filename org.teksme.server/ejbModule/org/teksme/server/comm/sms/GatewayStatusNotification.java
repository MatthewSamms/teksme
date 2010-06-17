package org.teksme.server.comm.sms;

import org.smslib.AGateway;
import org.smslib.AGateway.GatewayStatuses;
import org.smslib.IGatewayStatusNotification;

public class GatewayStatusNotification implements IGatewayStatusNotification {

	public void process(AGateway gateway, GatewayStatuses oldStatus,
			GatewayStatuses newStatus) {
		System.out.println(">>> Gateway Status change for "
				+ gateway.getGatewayId() + ", OLD: " + oldStatus + " -> NEW: "
				+ newStatus);
	}

}