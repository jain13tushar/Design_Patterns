package com.creational.factory.design.pattern.impl;

public class ClientFactory {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		printMessage(new TestMessageCreator());
	}

	public static void printMessage(MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg);
	}

}
