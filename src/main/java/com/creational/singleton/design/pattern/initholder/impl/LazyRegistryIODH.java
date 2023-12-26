package com.creational.singleton.design.pattern.initholder.impl;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that,
 * we have a lazy initialization without worrying about synchronization.
 * 
 * @author tushar
 *
 */
public class LazyRegistryIODH {

	private LazyRegistryIODH() {
		System.out.println("In LazyRegistryIODH singleton");
	}

	private static class RegistryHolder {
		static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
	}

	public static LazyRegistryIODH getInstance() {
		return RegistryHolder.INSTANCE;
	}

}
