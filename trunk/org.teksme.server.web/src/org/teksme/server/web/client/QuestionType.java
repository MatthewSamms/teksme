package org.teksme.server.web.client;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

@SuppressWarnings("rawtypes")
public enum QuestionType implements Enumeration {

	FREE_TEXT(0, "FREE_TEXT", "Free Text"),

	MULTIPLE_CHOICE(1, "MULTIPLE_CHOICE", "Multiple Chocie");

	public static final int FREE_TEXT_VALUE = 0;

	public static final int MULTIPLE_CHOICE_VALUE = 1;

	private static final QuestionType[] VALUES_ARRAY = new QuestionType[] {
			FREE_TEXT, MULTIPLE_CHOICE, };

	public static final List<QuestionType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	public static QuestionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	public static QuestionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	public static QuestionType get(int value) {
		switch (value) {
		case FREE_TEXT_VALUE:
			return FREE_TEXT;
		case MULTIPLE_CHOICE_VALUE:
			return MULTIPLE_CHOICE;
		}
		return null;
	}

	private final int value;

	private final String name;

	private final String literal;

	private QuestionType(int value, String name, String literal) {
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

	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object nextElement() {
		// TODO Auto-generated method stub
		return null;
	}

} // RestrictionKind
