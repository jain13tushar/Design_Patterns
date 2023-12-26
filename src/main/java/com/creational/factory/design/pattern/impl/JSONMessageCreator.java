package com.creational.factory.design.pattern.impl;

/**
 * Provides implementation for creating JSON messages
 * 
 * @author tushar
 *
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

}
