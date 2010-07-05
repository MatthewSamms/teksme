package org.teksme.server.web.shared;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum PageLinks {

	HOME(0, "HomeContent", "home"),

	SEND_MSG(1, "SendMessageContent", "section.sendmsg"),

	DASHBOARD(2, "DashboardContent", "section.dashboard"),

	CAMPAIGNS(3, "CampaignsContent", "section.campaigns"),

	CONTACTS(4, "ContactsContent", "section.contacts"),

	SETTINGS(5, "SettingsContent", "section.settings");

	public static final int HOME_VALUE = 0;

	public static final int SEND_MSG_VALUE = 1;

	public static final int DASHBOARD_VALUE = 2;

	public static final int CAMPAIGNS_VALUE = 3;

	public static final int CONTACTS_VALUE = 4;

	public static final int SETTINGS_VALUE = 5;

	private static final PageLinks[] VALUES_ARRAY = new PageLinks[] { HOME,
			SEND_MSG, DASHBOARD, CAMPAIGNS, CONTACTS, SETTINGS };

	public static final List<PageLinks> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	public static PageLinks get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PageLinks result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Channel Kind</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static PageLinks getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PageLinks result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	public static PageLinks get(int value) {
		switch (value) {
		case HOME_VALUE:
			return HOME;
		case SEND_MSG_VALUE:
			return SEND_MSG;
		case DASHBOARD_VALUE:
			return DASHBOARD;
		case CAMPAIGNS_VALUE:
			return CAMPAIGNS;
		case CONTACTS_VALUE:
			return CONTACTS;
		case SETTINGS_VALUE:
			return SETTINGS;
		}
		return null;
	}

	private final int value;

	private final String name;

	private final String literal;

	private PageLinks(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Override
	public String toString() {
		return literal;
	}
}
