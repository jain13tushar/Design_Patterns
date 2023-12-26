package com.principle.singleresponsibility.good;

import java.io.IOException;

public class GoodClientSingleResponsibility {

	private static final String VALID_USER_JSON = "{\"name\": \"Randy\", \"email\": \"randy@email.com\", \"address\": \"110 Sugar Lane\"}";

	private static final String INVALID_USER_JSON = "{\"name\": \"Sam\", \"email\": \"dam@email\", \"address\": \"111 Sugar Lane\"}";

	public static void main(String[] args) throws IOException {

		UserController controller = new UserController();

		String response = controller.createUser(VALID_USER_JSON);
		if (!response.equalsIgnoreCase("SUCCESS")) {
			System.err.println("Failed");
		}

		System.out.println("Valid JSON received response : " + response);

		response = controller.createUser(INVALID_USER_JSON);
		if (!response.equalsIgnoreCase("ERROR")) {
			System.err.println("Failed");
		}

		System.out.println("Invalid JSON received response : " + response);

	}

}
