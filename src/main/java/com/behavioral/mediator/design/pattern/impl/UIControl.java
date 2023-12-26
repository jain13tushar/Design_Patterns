package com.behavioral.mediator.design.pattern.impl;

public interface UIControl {

	void controlChanged(UIControl control);

	String getControlValue();

	String getControlName();

}
