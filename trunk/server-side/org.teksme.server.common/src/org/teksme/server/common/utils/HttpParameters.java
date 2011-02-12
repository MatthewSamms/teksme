package org.teksme.server.common.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class HttpParameters {

	Logger logger = Logger.getLogger(HttpParameters.class.getName());

	private List<Parameter> parameters;

	public HttpParameters() {
		parameters = new ArrayList<Parameter>(5);
	}

	public void addParameter(String name, boolean value) {
		String valueString = String.valueOf(value);
		addParameter(name, valueString);
	}

	public void addParameter(String name, int value) {
		String valueString = String.valueOf(value);
		addParameter(name, valueString);
	}

	public void addParameter(String name, String value) {
		Parameter parameter = new Parameter(name, value);
		addParameter(parameter);
	}

	private void addParameter(Parameter parameter) {
		synchronized (parameters) {
			parameters.add(parameter);
		}
	}

	public void printOn(StringBuffer buffer) {
		// buffer.append(spec);
		printParametersOn(buffer);
	}

	public void printParametersOn(StringBuffer buffer) {
		synchronized (parameters) {
			boolean empty = parameters.isEmpty();
			if (empty == true)
				return;
			buffer.append('?');
			Iterator<Parameter> iterator = parameters.iterator();
			while (iterator.hasNext() == true) {
				Parameter parameter = iterator.next();
				parameter.printOn(buffer);
				boolean last = iterator.hasNext() == false;
				if (last == false) {
					buffer.append('&');
				}
			}
		}
	}

	public String getParametersAsString() {
		StringBuffer buffer = new StringBuffer(150);
		printOn(buffer);
		String value = buffer.toString();
		return value;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

}
