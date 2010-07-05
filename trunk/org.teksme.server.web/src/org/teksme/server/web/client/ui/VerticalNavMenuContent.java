package org.teksme.server.web.client.ui;

import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class VerticalNavMenuContent extends Content {

	VerticalPanel panel = new VerticalPanel();

	public void setWidget() {

		RootPanel.get("stylized").removeFromParent();
	}

	@Override
	public void initWidget(Content content) {
		// TODO Auto-generated method stub
		
	}
}
