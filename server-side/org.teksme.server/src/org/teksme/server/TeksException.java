package org.teksme.server;

/**
 * An exception thrown by the TeksMe library.
 */

public class TeksException extends Exception {

	/**
	 * For subclasses only.
	 */
	protected TeksException() {
	}

	/**
	 * @param message
	 */
	public TeksException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public TeksException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public TeksException(String message, Throwable cause) {
		super(message, cause);
	}

	private static final long serialVersionUID = 1L;

}
