package com.structural.facade.design.pattern.impl;

public abstract class Template {

	public enum TemplateType {
		Email, NewsLetter
	};

	public abstract String format(Object obj);

}
