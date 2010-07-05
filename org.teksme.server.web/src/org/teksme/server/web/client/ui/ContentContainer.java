package org.teksme.server.web.client.ui;

public class ContentContainer {

	private static ContentContainer INSTANCE = null;

	public static ContentContainer getInstance() {

		if (INSTANCE != null) {
			return INSTANCE;
		} else {
			INSTANCE = new ContentContainer();
		}
		return INSTANCE;
	}

	public void setContent(Content content) {

	}
}
