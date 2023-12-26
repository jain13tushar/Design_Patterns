package com.principle.singleresponsibility.good;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserController {

	private UserPersistanceService persistanceService = new UserPersistanceService();

	public String createUser(String userJson) throws IOException {

		ObjectMapper mapper = new ObjectMapper();

		User user = mapper.readValue(userJson, User.class);

		UserValidator userValidator = new UserValidator();
		boolean isValid = userValidator.validateUser(user);

		if (!isValid) {
			return "ERROR";
		}

		persistanceService.saveUser(user);

		return "SUCCESS";

	}

}
