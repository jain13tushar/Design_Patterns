package com.principle.singleresponsibility.good;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

	public boolean validateUser(User user) {
		return isValidUser(user);
	}

	private boolean isValidUser(User user) {
		if (!isPresent(user.getName())) {
			return false;
		}

		user.setName(user.getName().trim());

		if (!isValidAlphaNumeric(user.getName())) {
			return false;
		}

		if (user.getEmail() == null || user.getEmail().trim().length() == 0) {
			return false;
		}

		user.setEmail(user.getEmail().trim());

		if (!isValidEmail(user.getEmail())) {
			return false;
		}

		return true;
	}

	private boolean isPresent(String value) {
		return value != null && value.trim().length() > 0;
	}

	private boolean isValidAlphaNumeric(String value) {
		Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
		Matcher matcher = pattern.matcher(value);
		return !matcher.find();
	}

	private boolean isValidEmail(String value) {
		Pattern pattern = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
				+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(value);
		return matcher.find();
	}

}
