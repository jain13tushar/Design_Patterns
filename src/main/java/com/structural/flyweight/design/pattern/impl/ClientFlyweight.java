package com.structural.flyweight.design.pattern.impl;

import com.structural.flyweight.design.pattern.impl.ErrorMessageFactory.ErrorType;

public class ClientFlyweight {

	public static void main(String[] args) {

		SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
		System.out.println(msg1.getText("4056"));

		UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
		System.out.println(msg2.getText(null));

	}

}
