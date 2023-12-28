package com.structural.decorator.design.pattern.impl;

public class ClientDecorator {

	public static void main(String[] args) {

		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

		Message decorator = new HtmlEncodedMessage(m);
		System.out.println(decorator.getContent());

		decorator = new Base64EncodedMessage(m);
		System.out.println(decorator.getContent());

	}

}
