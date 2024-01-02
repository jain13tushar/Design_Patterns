package com.behavioral.strategy.design.pattern.impl;

import java.util.Collection;

//Strategy
public interface OrderPrinter {

	void print(Collection<Order> orders);

}
