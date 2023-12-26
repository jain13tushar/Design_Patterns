package com.creational.abstractfactory.design.pattern.impl;

import com.creational.abstractfactory.design.pattern.impl.Instance.Capacity;

public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}

}
