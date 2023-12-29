package com.structural.facade.design.pattern.impl;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}

}
