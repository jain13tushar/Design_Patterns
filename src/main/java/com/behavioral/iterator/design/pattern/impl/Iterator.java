package com.behavioral.iterator.design.pattern.impl;

//Iterator interface allowing to iterate over
//values of an aggregate
public interface Iterator<T> {

	boolean hasNext();

	T next();

}
