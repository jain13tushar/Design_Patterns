package com.creational.singleton.design.pattern.initholder.impl;

public class ClientLazyRegistrySingleton {

	public static void main(String[] args) {

		LazyRegistryIODH singleton;
		singleton = LazyRegistryIODH.getInstance();
		singleton = LazyRegistryIODH.getInstance();
	}

}
