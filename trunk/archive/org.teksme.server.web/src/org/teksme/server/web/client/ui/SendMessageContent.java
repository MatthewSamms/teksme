package org.teksme.server.web.client.ui;

import org.teksme.server.web.client.SendMessageService;
import org.teksme.server.web.client.SendMessageServiceAsync;
import org.teksme.server.web.shared.FieldVerifier;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class SendMessageContent extends Content {

	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private final SendMessageServiceAsync sendMessageService = GWT
			.create(SendMessageService.class);

	public void setWidget() {

		VerticalPanel mainVPanel = new VerticalPanel();
		Grid gridPanel = new Grid(4, 2);

		gridPanel.setCellSpacing(0);
		gridPanel.setCellPadding(0);
		gridPanel.setBorderWidth(0);

		final ListBox countryListBox = new ListBox();
		final TextBox mobileNumberBox = new TextBox();
		final TextArea messageTextArea = new TextArea();
		final Button sendButton = new Button("Send");

		countryListBox.addItem("USA", "USA");
		countryListBox.setVisibleItemCount(1);
		
		final Label errorLabel = new Label();

		final FormPanel form = new FormPanel();
		form.setEncoding(FormPanel.ENCODING_MULTIPART);
		form.setMethod(FormPanel.METHOD_POST);

		mainVPanel.add(new HTML("<h1>Send a text message</h1>"));

		mainVPanel
				.add(new HTML(
						"<p>Enter the mobile phone number into the space provided below, click send, and we will send a message for you.</p>"));

		gridPanel
				.setWidget(
						0,
						0,
						new HTML(
								"<label> Country <span class='small'>Select the country</span></label>"));

		gridPanel.setWidget(0, 1, countryListBox);

		gridPanel
				.setWidget(
						1,
						0,
						new HTML(
								"<label>Mobile number <span class='small'> Prefix and Number (no leading zero, no spaces)</span> </label>"));

		gridPanel.setWidget(1, 1, mobileNumberBox);

		gridPanel
				.setWidget(
						2,
						0,
						new HTML(
								"<label>Message Text<span class='small'>Max. 130 characteres </span> </label>"));

		gridPanel.setWidget(2, 1, messageTextArea);

		gridPanel.setWidget(3, 1, sendButton);

		mainVPanel.add(gridPanel);

		form.add(mainVPanel);

		// Create the popup dialog box
		final DialogBox dialogBox = new DialogBox();
		dialogBox.setText("Send Message Status");
		dialogBox.setAnimationEnabled(true);
		final Button closeButton = new Button("Close");
		// We can set the id of a widget by accessing its Element
		closeButton.getElement().setId("closeButton");
		final Label textToServerLabel = new Label();
		final HTML serverResponseLabel = new HTML();
		VerticalPanel dialogVPanel = new VerticalPanel();
		dialogVPanel.addStyleName("dialogVPanel");
		dialogVPanel.add(new HTML("<b>Sending name to the server:</b>"));
		dialogVPanel.add(textToServerLabel);
		dialogVPanel.add(new HTML("<br><b>Server replies:</b>"));
		dialogVPanel.add(serverResponseLabel);
		dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
		dialogVPanel.add(closeButton);
		dialogBox.setWidget(dialogVPanel);

		// Add a handler to close the DialogBox
		closeButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				dialogBox.hide();
				sendButton.setEnabled(false);
				sendButton.setFocus(true);
			}
		});

		// Create a handler for the sendButton and nameField
		class MyHandler implements ClickHandler, KeyUpHandler {
			/**
			 * Fired when the user clicks on the sendButton.
			 */
			public void onClick(ClickEvent event) {
				sendNameToServer();
			}

			/**
			 * Fired when the user types in the nameField.
			 */
			public void onKeyUp(KeyUpEvent event) {
				if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
					sendNameToServer();
				}
			}

			/**
			 * Send the name from the nameField to the server and wait for a
			 * response.
			 */
			private void sendNameToServer() {

				String textToServer = messageTextArea.getText();
				if (!FieldVerifier.isValidName(textToServer)) {
					errorLabel.setText("Please enter at least four characters");
					return;
				}

				// Then, we send the input to the server.
				sendButton.setEnabled(false);
				textToServerLabel.setText(textToServer);
				serverResponseLabel.setText("");
				sendMessageService.sendMessageToServer(textToServer,
						new AsyncCallback<String>() {
							public void onFailure(Throwable caught) {
								// Show the RPC error message to the user
								dialogBox
										.setText("Remote Procedure Call - Failure");
								serverResponseLabel
										.addStyleName("serverResponseLabelError");
								serverResponseLabel.setHTML(SERVER_ERROR);
								dialogBox.center();
								closeButton.setFocus(true);
							}

							public void onSuccess(String result) {

								dialogBox.setText("Remote Procedure Call");
								serverResponseLabel
										.removeStyleName("serverResponseLabelError");
								serverResponseLabel.setHTML(result);
								dialogBox.center();
								closeButton.setFocus(true);
							}
						});
			}
		}

		// Add a handler to send the name to the server
		MyHandler handler = new MyHandler();
		sendButton.addClickHandler(handler);
		mobileNumberBox.addKeyUpHandler(handler);

		RootPanel.get("stylized").add(form);

	}

	
}
