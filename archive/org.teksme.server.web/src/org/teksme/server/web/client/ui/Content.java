package org.teksme.server.web.client.ui;

import com.google.gwt.user.client.ui.Composite;

public abstract class Content extends Composite {

	public Content() {
		setWidget();
	}

	public abstract void setWidget();
}
