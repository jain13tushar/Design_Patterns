package com.creational.builder.design.pattern.impl2;

import java.time.LocalDate;
import java.time.Period;

// Product class
public class UserDTO {

	private String name;

	private String address;

	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + ", age=" + age;
	}

	// Get builder instance
	public static UserDTOBuilder getBuilder() {
		return new UserDTOBuilder();
	}

	public static class UserDTOBuilder {

		private String firstName;

		private String lastName;

		private String age;

		private String address;

		private UserDTO userDTO;

		public UserDTOBuilder withFirstName(String fname) {
			this.firstName = fname;
			return this;
		}

		public UserDTOBuilder withLastName(String lname) {
			this.lastName = lname;
			return this;
		}

		public UserDTOBuilder withBirthday(LocalDate date) {
			Period ageInYears = Period.between(date, LocalDate.now());
			age = Integer.toString(ageInYears.getYears());
			return this;
		}

		public UserDTOBuilder withAddress(Address address) {
			this.address = address.getHouseNumber() + ", " + address.getStreet() + "\n" + address.getCity() + "\n"
					+ address.getState() + " " + address.getZipcode();
			return this;
		}

		public UserDTO build() {
			this.userDTO = new UserDTO();
			userDTO.setName(firstName + " " + lastName);
			userDTO.setAddress(address);
			userDTO.setAge(age);
			return this.userDTO;
		}

		public UserDTO getUserDTO() {
			return userDTO;
		}

	}

}
