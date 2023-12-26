package com.creational.builder.design.pattern.impl2;

import java.time.LocalDate;

import com.creational.builder.design.pattern.impl2.UserDTO.UserDTOBuilder;

//This is our ClientBuilder which also works as "director"
public class ClientBuilderTwo {

	public static void main(String[] args) {

		User user = createUser();

		// Client has to provide director with concrete builder.
		UserDTO dto = directBuild(UserDTO.getBuilder(), user);
		System.out.println(dto);

	}

	/**
	 * This method serves the role of director in builder pattern.
	 */
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withAddress(user.getAddress()).withBirthday(user.getBirthday()).build();
	}

	/**
	 * Returns a simple user.
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Insiana");
		address.setZipcode("48998");
		user.setAddress(address);
		return user;
	}

}
