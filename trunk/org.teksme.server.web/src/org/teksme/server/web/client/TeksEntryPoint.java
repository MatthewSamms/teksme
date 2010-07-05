package org.teksme.server.web.client;

import org.teksme.server.web.client.ui.AppHeader;
import org.teksme.server.web.client.ui.ContentContainer;
import org.teksme.server.web.client.ui.HomeContent;
import org.teksme.server.web.client.ui.RecommendationsBox;
import org.teksme.server.web.client.ui.SendMessageContent;
import org.teksme.server.web.shared.PageLinks;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;

@SuppressWarnings("rawtypes")
public class TeksEntryPoint implements EntryPoint, ValueChangeHandler {

	@SuppressWarnings("unchecked")
	@Override
	public void onModuleLoad() {
		History.addValueChangeHandler(this);

		String historyToken = History.getToken();

		if (historyToken.isEmpty()) {
			History.newItem("home");
		} else {
			System.out.println("TeksEntryPoint.onModuleLoad()");
			// changePage(PageLinks.get(historyToken));
		}

	}

	@Override
	public void onValueChange(ValueChangeEvent event) {
		try {
			changePage(History.getToken());
		} catch (PageNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void changePage(String token) throws PageNotFoundException {

		System.out.println("Token: " + token);
		System.out.println("Page: " + PageLinks.get(token));
		PageLinks page = PageLinks.get(token);
		if (page == null)
			throw new PageNotFoundException();

		switch (page) {
		case HOME:
			ContentContainer.getInstance().setContent(new RecommendationsBox());
		case CAMPAIGNS:
			ContentContainer.getInstance().setContent(new SendMessageContent());
		default:
			ContentContainer.getInstance().setContent(new HomeContent());
			ContentContainer.getInstance().setContent(new AppHeader());
			break;
		}

	}

}