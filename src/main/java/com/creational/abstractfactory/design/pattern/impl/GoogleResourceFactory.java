package com.creational.abstractfactory.design.pattern.impl;

import com.creational.abstractfactory.design.pattern.impl.Instance.Capacity;

public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}

}
