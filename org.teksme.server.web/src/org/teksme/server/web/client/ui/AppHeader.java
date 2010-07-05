package org.teksme.server.web.client.ui;

import org.teksme.server.web.shared.PageLinks;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class AppHeader extends Content {

	public void setWidget() {

		setTopNav();
		setDateTime();

	}

	private void setDateTime() {
		// TODO Auto-generated method stub

		HorizontalPanel panel = new HorizontalPanel();
		panel.setSpacing(3);
		panel.setBorderWidth(0);

		Label date = new Label("Tuesday, June 22, 2010");
		Label separator = new Label("  |  ");
		Label time = new Label("8:56PM");

		panel.add(date);
		panel.add(separator);
		panel.add(time);

		RootPanel.get("datetime").add(panel);

	}

	private void setTopNav() {
		HorizontalPanel panel = new HorizontalPanel();
		panel.setSpacing(2);
		panel.setBorderWidth(0);

		Label personName = new Label("Welcome Fabiano!");
		Hyperlink link1 = new Hyperlink("Dashboard",
				PageLinks.DASHBOARD.getLiteral());
		Hyperlink link2 = new Hyperlink("Campaigns",
				PageLinks.CAMPAIGNS.getLiteral());
		Hyperlink link3 = new Hyperlink("Contacts",
				PageLinks.CONTACTS.getLiteral());
		Hyperlink link4 = new Hyperlink("Settings",
				PageLinks.SETTINGS.getLiteral());
		Hyperlink link5 = new Hyperlink("Help", "help");
		Hyperlink link6 = new Hyperlink("Sign out", "signout");

		personName.setStyleName("personname");
		panel.add(personName);
		panel.add(new Label("  |  "));
		panel.add(link1);
		panel.add(new Label("  |  "));
		panel.add(link2);
		panel.add(new Label("  |  "));
		panel.add(link3);
		panel.add(new Label("  |  "));
		panel.add(link4);
		panel.add(new Label("  |  "));
		panel.add(link5);
		panel.add(new Label("  |  "));
		panel.add(link6);

		// RootPanel.get("personName").add(personName);
		RootPanel.get("viewSelector").add(panel);

	}

	@Override
	public void initWidget(Content content) {
		// TODO Auto-generated method stub
		
	}
}
