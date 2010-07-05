package org.teksme.server.web.client.ui;

import com.google.gwt.user.client.ui.Composite;

public abstract class Content extends Composite {

	public Content() {
		initWidget(this);
		setWidget();
	}

	public abstract void initWidget(Content content);
	public abstract void setWidget();
}
