package com.behavioral.interpreter.design.pattern.impl;

//Abstract expression
public interface PermissionExpression {

	boolean interpret(User user);

}
