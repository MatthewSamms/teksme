package org.teksme.server.common.utils;

public class Parameter {

	private String name;
	private String value;

	public Parameter(String name, String value) {
		super();
		if (name == null)
			throw new IllegalArgumentException("name must not be null");
		if (value == null)
			throw new IllegalArgumentException("value must not be null");
		this.name = name;
		this.value = value;
	}

	public void printOn(StringBuffer buffer) {
		buffer.append(this.name);
		buffer.append('=');
		buffer.append(this.value);
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer(50);
		printOn(buffer);
		String value = buffer.toString();
		return value;
	}

}
