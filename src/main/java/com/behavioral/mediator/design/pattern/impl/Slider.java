package com.behavioral.mediator.design.pattern.impl;

public class Slider extends javafx.scene.control.Slider implements UIControl {

	private UIMeadiator meadiator;

	private boolean mediatedUpdated;

	public Slider(UIMeadiator meadiator) {
		this.meadiator = meadiator;
		setMin(0);
		setMax(50);
		setBlockIncrement(5);
		meadiator.register(this);
		this.valueProperty().addListener((v, o, n) -> {
			if (!mediatedUpdated) {
				this.meadiator.valueChanged(this);
			}
		});
	}

	@Override
	public void controlChanged(UIControl control) {
		mediatedUpdated = true;
		setValue(Double.valueOf(control.getControlValue()));
		mediatedUpdated = false;
	}

	@Override
	public String getControlName() {
		return "Slider";
	}

	@Override
	public String getControlValue() {
		return Double.toString(getValue());
	}

}
