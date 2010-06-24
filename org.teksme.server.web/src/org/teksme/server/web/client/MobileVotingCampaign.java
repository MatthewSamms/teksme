package org.teksme.server.web.client;

import java.util.Iterator;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTMLTable.Cell;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MobileVotingCampaign implements EntryPoint {

	private VerticalPanel mainVPanel = new VerticalPanel();

	private FlexTable formLayout = new FlexTable();

	private Button doneButton = new Button("Done");

	public void onModuleLoad() {

		FlexCellFormatter cellFormatter = formLayout.getFlexCellFormatter();

		// Add a title to the form
		// formLayout.setHTML(0, 0, "");
		// cellFormatter.setColSpan(0, 0, 2);
		cellFormatter.setHorizontalAlignment(0, 0,
				HasHorizontalAlignment.ALIGN_CENTER);

		formLayout.setCellSpacing(5);
		formLayout.setCellPadding(3);
		formLayout.setBorderWidth(0);

		mainVPanel.setHorizontalAlignment(HorizontalPanel.ALIGN_RIGHT);

		// addFreeTextPanel(formLayout);

		addMultipleChoicePanel(formLayout);

		// Wrap the content in a DecoratorPanel
		DecoratorPanel decPanel = new DecoratorPanel();
		decPanel.setWidget(formLayout);

		// Assemble Main panel.
		mainVPanel.add(decPanel);

		mainVPanel.add(doneButton);

		// Associate the Main panel with the HTML host page.
		//RootPanel.get("campaignEdtPanel").add(mainVPanel);

	}

	private Grid buildCommonGrid(int rows, int cols,
			QuestionType selectedQuestionType) {
		HorizontalPanel commandsHPanel = new HorizontalPanel();

		PushButton addQuestionButton = new PushButton("Edit");
		PushButton duplicateQuestionButton = new PushButton("Duplicate");
		PushButton deleteQuestionButton = new PushButton("Delete");

		commandsHPanel.add(addQuestionButton);
		commandsHPanel.add(duplicateQuestionButton);
		commandsHPanel.add(deleteQuestionButton);

		deleteQuestionButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				removeRow(formLayout, formLayout.getCellForEvent(event));
			}
		});

		addQuestionButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				addFreeTextPanel(formLayout);
			}
		});

		TextBox newQuestionTextBox = new TextBox();
		Label questionLabel = new Label("Question:");
		Label questionTypeLabel = new Label("Question Type:");

		ListBox questionTypeListBox = new ListBox();

		for (Iterator<QuestionType> iterator = QuestionType.VALUES.iterator(); iterator
				.hasNext();) {
			QuestionType type = iterator.next();

			questionTypeListBox.addItem(type.getLiteral(), type.getName());
		}

		// Make enough room for all five items (setting this value to 1 turns it
		// into a drop-down list).
		questionTypeListBox.setVisibleItemCount(1);
		questionTypeListBox.setSelectedIndex(selectedQuestionType.getValue());

		// Focus the cursor on the name field when the app loads
		newQuestionTextBox.setFocus(true);
		newQuestionTextBox.selectAll();

		// Create a grid
		Grid grid = new Grid(rows, cols);
		grid.setBorderWidth(0);
		grid.setCellPadding(3);
		grid.setCellSpacing(3);

		grid.setWidget(0, 2, commandsHPanel);

		grid.setWidget(1, 0, questionLabel);
		grid.setWidget(1, 1, newQuestionTextBox);

		grid.setWidget(2, 0, questionTypeLabel);
		grid.setWidget(2, 1, questionTypeListBox);

		return grid;
	}

	private void addMultipleChoicePanel(FlexTable flexTable) {

		Grid grid = buildCommonGrid(6, 4, QuestionType.MULTIPLE_CHOICE);

		Label optionLabel = new Label("Option:");

		TextBox optionTextBox = new TextBox();
		TextBox keywordTextBox = new TextBox();
		PushButton delButton = new PushButton("X");
		PushButton addOptionButton = new PushButton("Add an Option");

		keywordTextBox.setText("AUTO KEYWORD");
		
		grid.setWidget(3, 0, optionLabel);
		grid.setWidget(3, 1, optionTextBox);
		grid.setWidget(3, 2, keywordTextBox);
		grid.setWidget(3, 3, delButton);
		

		grid.setWidget(4, 0, addOptionButton);

		int numRows = flexTable.getRowCount();

		flexTable.setWidget(numRows, 0, grid);

		flexTable.getFlexCellFormatter().setRowSpan(0, 1, numRows + 1);

	}

	private void addFreeTextPanel(FlexTable flexTable) {

		Grid grid = buildCommonGrid(4, 3, QuestionType.FREE_TEXT);

		int numRows = grid.getRowCount() + 1;

		TextBox keywordTextBox = new TextBox();
		Label keywordLabel = new Label("Keyword:");
		Button checkAvailabilityButton = new Button("Check Availability");

		grid.setWidget(3, 0, keywordLabel);
		grid.setWidget(3, 1, keywordTextBox);
		grid.setWidget(3, 2, checkAvailabilityButton);

		numRows = flexTable.getRowCount();

		flexTable.setWidget(numRows, 0, grid);

		flexTable.getFlexCellFormatter().setRowSpan(0, 1, numRows + 1);

	}

	/**
	 * Remove a row from the flex table.
	 */
	private void removeRow(FlexTable flexTable, Cell cell) {
		int numRows = flexTable.getRowCount();
		if (numRows > 1) {
			// flexTable.removeRow(numRows - 1);
			flexTable.removeRow(cell.getRowIndex());
			flexTable.getFlexCellFormatter().setRowSpan(0, 1, numRows - 1);
		}
	}

}
