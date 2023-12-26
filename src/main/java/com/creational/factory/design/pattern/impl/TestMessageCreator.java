package com.creational.factory.design.pattern.impl;

/**
 * Provides implementation for creating Text messages.
 * 
 * @author tushar
 *
 */
public class TestMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}

}
