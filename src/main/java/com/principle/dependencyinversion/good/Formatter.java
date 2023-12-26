package com.principle.dependencyinversion.good;

public interface Formatter {

	public String format(Message message) throws FormatException;

}
