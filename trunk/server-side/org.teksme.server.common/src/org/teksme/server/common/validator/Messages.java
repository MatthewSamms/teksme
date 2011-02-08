package org.teksme.server.common.validator;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {

	private static final String BUNDLE_NAME = "response_messages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	/**
	 * Whether to translate strings by default.
	 */
	protected boolean shouldTranslate = true;

	private Messages() {
	}

	/**
	 * Indicates whether strings should be translated by default.
	 * 
	 * @return <code>true</code> if strings should be translated by default;
	 *         <code>false</code> otherwise.
	 */
	public boolean shouldTranslate() {
		return shouldTranslate;
	}

	/**
	 * Sets whether strings should be translated by default.
	 * 
	 * @param shouldTranslate
	 *            whether strings should be translated by default.
	 */
	public void setShouldTranslate(boolean shouldTranslate) {
		this.shouldTranslate = shouldTranslate;
	}

	public static String getString(String key, Object[] substitutions) {
		return MessageFormat.format(getString(key), substitutions);
	}

	/*
	 * Javadoc copied from interface.
	 */
	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}

	}

}
