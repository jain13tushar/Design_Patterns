package com.creational.factory.design.pattern.impl;

/**
 * This is our abstract "creator". The abstract method createMessage() has to be
 * implemented by its subclasses.
 * 
 * @author tushar
 *
 */
public abstract class MessageCreator {

	public Message getMessage() {
		Message msg = createMessage();
		msg.addDefaultHeaders();
		msg.encrypt();
		return msg;
	}

	// Factory Method
	public abstract Message createMessage();

}
