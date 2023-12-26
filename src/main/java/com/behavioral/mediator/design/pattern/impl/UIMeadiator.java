package com.behavioral.mediator.design.pattern.impl;

import java.util.ArrayList;
import java.util.List;

public class UIMeadiator {

	List<UIControl> colleagues = new ArrayList<UIControl>();

	public void register(UIControl control) {
		colleagues.add(control);
	}

	public void valueChanged(UIControl control) {
		colleagues.stream().filter(c -> c != control).forEach(c -> c.controlChanged(control));
	}

}
