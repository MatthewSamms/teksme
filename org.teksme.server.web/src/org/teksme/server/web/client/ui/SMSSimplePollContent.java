package org.teksme.server.web.client.ui;

import java.util.Date;

import org.teksme.server.web.shared.DateTimeUtils;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLTable.CellFormatter;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DatePicker;

public class SMSSimplePollContent extends Content {

	@Override
	public void setWidget() {

		FlexTable flexTable = new FlexTable();
		flexTable.setCellSpacing(0);
		flexTable.setCellPadding(0);
		flexTable.setBorderWidth(0);

		VerticalPanel mainVPanel = new VerticalPanel();

		Grid gridPanel = new Grid(3, 3);

		gridPanel.setCellSpacing(0);
		gridPanel.setCellPadding(0);
		gridPanel.setBorderWidth(0);

		final TextBox questionBox = new TextBox();
		final TextBox keywordBox = new TextBox();
		final PushButton keyAvailabilityButton = new PushButton("Availability");
		final Button savePollButton = new Button("Save Poll");

		final FormPanel form = new FormPanel();
		form.setEncoding(FormPanel.ENCODING_MULTIPART);
		form.setMethod(FormPanel.METHOD_POST);

		mainVPanel.add(new HTML("<h1>Simple SMS Poll</h1>"));

		mainVPanel
				.add(new HTML(
						"<p>With SMS poll you can engage your audience - customers, conference attendees, students, fans - to quickly and easily gather in-moment data and show the results in real-time.</p>"));

		gridPanel
				.setWidget(
						0,
						0,
						new HTML(
								"<label> Question <span class='small'>Ask open-ended questions to get good info.</span></label>"));

		gridPanel.setWidget(0, 1, questionBox);

		gridPanel
				.setWidget(
						1,
						0,
						new HTML(
								"<label> Keyword <span class='small'>Create a memorable create to your audience.</span></label>"));

		HorizontalPanel panel = new HorizontalPanel();
		panel.setSpacing(3);
		panel.setBorderWidth(0);

		panel.add(keywordBox);
		panel.add(keyAvailabilityButton);

		panel.setCellVerticalAlignment(keyAvailabilityButton,
				HasVerticalAlignment.ALIGN_TOP);

		gridPanel.setWidget(1, 1, panel);

		// gridPanel.setWidget(1, 2, keyAvailabilityButton);

		CellFormatter cellFormatter = gridPanel.getCellFormatter();
		cellFormatter.setAlignment(1, 2, HorizontalPanel.ALIGN_LEFT,
				VerticalPanel.ALIGN_MIDDLE);

		mainVPanel.add(gridPanel);

		flexTable.setWidget(0, 0, mainVPanel);

		DisclosurePanel advConfigPanel = createAdvancedConfigPanel();

		flexTable.setWidget(1, 0, advConfigPanel);

		flexTable.setWidget(2, 0, savePollButton);

		form.add(flexTable);

		RootPanel.get("stylized").add(form);
	}

	private String actualHour = null;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private DisclosurePanel createAdvancedConfigPanel() {
		final DisclosurePanel disc = new DisclosurePanel(
				"Advanced Configurations: ");
		disc.setStylePrimaryName("my-DisclosurePanel");

		final Grid mainFormGridPanel = new Grid(7, 2);
		mainFormGridPanel.setCellSpacing(3);
		mainFormGridPanel.setBorderWidth(0);

		final RadioButton multipleVotesRb1 = new RadioButton(
				"multipleVotesGroup");
		final RadioButton multipleVotesRb2 = new RadioButton(
				"multipleVotesGroup");
		
		final RadioButton pollClosingRb1 = new RadioButton("pollClosingGroup");
		final RadioButton pollClosingRb2 = new RadioButton("pollClosingGroup");

		final PushButton dateButton = new PushButton(new Image(
				"img/datepicker-icon.gif"));
		dateButton.setStylePrimaryName("teks-PushButton-up");

		final TextBox dateField = new TextBox();
		dateField.setWidth("100px");

		final DatePicker datePicker = new DatePicker();

		final ListBox hoursBox = new ListBox();
		final ListBox minutesBox = new ListBox();

		final HorizontalPanel closingPollDateHPanel = new HorizontalPanel();
		closingPollDateHPanel.setSpacing(3);
		closingPollDateHPanel.setBorderWidth(0);

		multipleVotesRb1
				.setHTML("<span class='small2'>No. Voters can only vote once.</span>");
		multipleVotesRb2
				.setHTML("<span class='small2'>Yes. Voters may responde as much as they like.</span>");

		mainFormGridPanel
				.setWidget(
						0,
						0,
						new HTML(
								"<p>Would you like to accept multiple votes per voter for your poll?</p>"));
		mainFormGridPanel.setWidget(1, 0, multipleVotesRb1);
		mainFormGridPanel.setWidget(2, 0, multipleVotesRb2);

		mainFormGridPanel.setWidget(3, 0, new HTML(
				"<p> Poll closing times: </p>"));

		pollClosingRb1.setHTML("<span class='small2'>Never Close.</span>");
		pollClosingRb2
				.setHTML("<span class='small2'>I would like to set an auto-stop time and date for my poll.</span>");

		mainFormGridPanel.setWidget(4, 0, pollClosingRb1);
		mainFormGridPanel.setWidget(5, 0, pollClosingRb2);

		datePicker.addValueChangeHandler(new ValueChangeHandler() {
			public void onValueChange(ValueChangeEvent event) {
				Date date = (Date) event.getValue();
				String dateString = DateTimeFormat.getFormat("d MMMM yyyy")
						.format(date);
				dateField.setText(dateString);
			}
		});

		ClickHandler dateButtonHandler = new ClickHandler() {
			public void onClick(ClickEvent event) {
				PopupPanel popupPanel = new PopupPanel(true);
				popupPanel.add(datePicker);
				popupPanel.setPopupPosition(
						dateButton.getAbsoluteLeft(),
						dateButton.getAbsoluteTop()
								+ dateButton.getOffsetHeight());
				popupPanel.show();
			}
		};
		dateButton.addClickHandler(dateButtonHandler);
		dateField.setFocus(true);

		String[][] hours = DateTimeUtils.INSTANCE.getHoursArray();
		for (int i = 0; i < hours.length; i++) {
			hoursBox.addItem(hours[i][1], hours[i][0]);
		}
		hoursBox.setVisibleItemCount(1);
		hoursBox.setWidth("50px");

		hoursBox.addChangeHandler(new ChangeHandler() {
			public void onChange(ChangeEvent event) {
				int selectedIndex = hoursBox.getSelectedIndex();
				if (selectedIndex > 0) {
					actualHour = hoursBox.getValue(selectedIndex);
				}
			}
		});

		String[][] minutes = DateTimeUtils.INSTANCE.getMinutesArray();
		for (int i = 0; i < minutes.length; i++) {
			minutesBox.addItem(minutes[i][1], minutes[i][0]);
		}
		minutesBox.setVisibleItemCount(1);
		minutesBox.setWidth("50px");

		closingPollDateHPanel.add(dateField);
		closingPollDateHPanel.add(dateButton);
		closingPollDateHPanel.add(hoursBox);
		closingPollDateHPanel.add(minutesBox);
		closingPollDateHPanel.setVisible(false);

		multipleVotesRb1.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				closingPollDateHPanel.setVisible(false);

			}
		});

		pollClosingRb2.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				closingPollDateHPanel.setVisible(true);
			}
		});

		mainFormGridPanel.setWidget(6, 0, closingPollDateHPanel);

		disc.setContent(mainFormGridPanel);

		return disc;

	}
}
