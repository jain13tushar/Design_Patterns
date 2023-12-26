package com.creational.factory.design.pattern.impl;

/**
 * This class represents interface for out "product" which is a message
 * Implementations will be specific to content type.
 * 
 * @author tushar
 *
 */
public abstract class Message {

	public abstract String getContent();

	public void addDefaultHeaders() {
		// Add some default headers
	}

	public void encrypt() {

	}

}
