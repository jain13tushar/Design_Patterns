package com.behavioral.iterator.design.pattern.impl;

public class ClientIterator {

	public static void main(String[] args) {

		Iterator<ThemeColor> iter = ThemeColor.getIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
