package com.structural.bridge.design.pattern.impl;

//This is the abstraction
//It represents a First in First Out Collection
public interface FifoCollection<T> {

	// Adds element to Collection
	void offer(T element);

	// Removes & returns first element from collection
	T poll();

}
