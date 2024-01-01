package com.behavioral.interpreter.design.pattern.impl;

//Terminal expression
public class Permission implements PermissionExpression {

	private String permission;

	public Permission(String permission) {
		this.permission = permission.toLowerCase();
	}

	@Override
	public boolean interpret(User user) {
		return user.getPermission().contains(permission);
	}

	@Override
	public String toString() {
		return permission;
	}

}
