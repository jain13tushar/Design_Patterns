package com.behavioral.mediator.design.pattern.impl;

public class Label extends javafx.scene.control.Label implements UIControl {

	private UIMeadiator meadiator;

	public Label(UIMeadiator meadiator) {
		this.meadiator = meadiator;
		this.setMinWidth(100);
		this.setText("Label");
		meadiator.register(this);
	}

	@Override
	public void controlChanged(UIControl control) {
		setText(control.getControlValue());
	}

	@Override
	public String getControlValue() {
		return getText();
	}

	@Override
	public String getControlName() {
		return "Label";
	}

}
