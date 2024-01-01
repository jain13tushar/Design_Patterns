package com.behavioral.mediator.design.pattern.impl;

//Abstract colleague
public interface UIControl {

	void controlChanged(UIControl control);

	String getControlValue();

	String getControlName();

}
