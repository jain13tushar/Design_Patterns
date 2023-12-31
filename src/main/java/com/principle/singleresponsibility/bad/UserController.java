package com.principle.singleresponsibility.bad;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserController {

	private Store store = new Store();

	public String createUser(String userJson) throws IOException {

		ObjectMapper mapper = new ObjectMapper();

		User user = mapper.readValue(userJson, User.class);

		// For validation we need to create UserValidator class as it violates SRP.
		if (!isValidUser(user)) {
			return "ERROR";
		}

		// For Storage we need to create UserPersistanceService class as it violates
		// SRP.
		store.store(user);

		return "SUCCESS";

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
