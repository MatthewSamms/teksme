package org.teksme.server.web.client.ui;

import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;

public class RecommendationsBox extends Content {

	@Override
	public void setWidget() {

		FlexTable formLayout = new FlexTable();
		FlexTable recommendationPanel = new FlexTable();

		formLayout.setCellSpacing(0);
		formLayout.setCellPadding(0);
		formLayout.setBorderWidth(0);

		recommendationPanel.setCellSpacing(0);
		recommendationPanel.setCellPadding(0);
		recommendationPanel.setBorderWidth(0);

		formLayout.setStyleName("re-box");

		HTMLPanel recommBoxHeader = new HTMLPanel("Recommended for you");
		recommBoxHeader.setStyleName("re-box-header");

		formLayout.setWidget(0, 0, recommBoxHeader);

		StringBuffer htmlFrag = new StringBuffer();
		htmlFrag.append("<div class='re-title'>SMS Poll</div>");
		htmlFrag.append("<a href=''><img src='' alt='' class='re-img'></a>");
		htmlFrag.append("<div class='re-desc'>Your can ask your audience a question and they can answer using SMS, text messages, Twitter, email, or the web.</div>");
		htmlFrag.append("<a href='' class='re-link'>Learn more &raquo;</a><br>");

		recommendationPanel.setHTML(0, 0, htmlFrag.toString());

		SimplePanel panel = new SimplePanel();

		panel.setWidget(recommendationPanel);
		panel.setStyleName("re-box-body");

		formLayout.setWidget(1, 0, panel);

		RootPanel.get("LinkRecommendation-ROOT").add(formLayout);

	}

}
