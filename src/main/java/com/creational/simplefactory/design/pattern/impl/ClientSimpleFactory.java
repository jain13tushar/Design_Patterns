package com.creational.simplefactory.design.pattern.impl;

public class ClientSimpleFactory {

	public static void main(String[] args) {

		Post post = PostFactory.createPost("blog");
		System.out.println(post);
	}

}
