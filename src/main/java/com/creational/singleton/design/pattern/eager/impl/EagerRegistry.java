package com.creational.singleton.design.pattern.eager.impl;

/**
 * This class uses eager initialization of singleton instance.
 * 
 * @author tushar
 *
 */
public class EagerRegistry {

	private EagerRegistry() {

	}

	private static final EagerRegistry INSTANCE = new EagerRegistry();

	public static EagerRegistry getInstance() {
		return INSTANCE;
	}

}
