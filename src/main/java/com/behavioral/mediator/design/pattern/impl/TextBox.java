package com.behavioral.mediator.design.pattern.impl;

import javafx.scene.control.TextField;

public class TextBox extends TextField implements UIControl {

	private UIMeadiator meadiator;

	private boolean mediatedUpdate;

	public TextBox(UIMeadiator meadiator) {
		this.meadiator = meadiator;
		this.setText("Textbox");
		this.meadiator.register(this);

		this.textProperty().addListener((v, o, n) -> {
			if (!mediatedUpdate) {
				this.meadiator.valueChanged(this);
			}
		});
	}

	@Override
	public void controlChanged(UIControl control) {
		this.mediatedUpdate = true;
		this.setText(control.getControlValue());
		this.mediatedUpdate = false;
	}

	@Override
	public String getControlValue() {
		return getText();
	}

	@Override
	public String getControlName() {
		return "Textbook";
	}

}
