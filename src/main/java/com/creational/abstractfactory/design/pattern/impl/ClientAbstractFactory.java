package com.creational.abstractfactory.design.pattern.impl;

import com.creational.abstractfactory.design.pattern.impl.Instance.Capacity;

public class ClientAbstractFactory {

	private ResourceFactory factory;

	public ClientAbstractFactory(ResourceFactory factory) {
		this.factory = factory;
	}

	public Instance createServer(Instance.Capacity capacity, int storageMib) {
		Instance instance = factory.createInstance(capacity);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}

	public static void main(String[] args) {

		ClientAbstractFactory aws = new ClientAbstractFactory(new AwsResourceFactory());
		Instance i1 = aws.createServer(Capacity.micro, 20480);
		i1.start();
		i1.stop();

		System.out.println("**************************************");

		ClientAbstractFactory gcp = new ClientAbstractFactory(new GoogleResourceFactory());
		Instance g1 = gcp.createServer(Capacity.micro, 20480);
		g1.start();
		g1.stop();

	}

}
