package com.principle.dependencyinversion.bad;

import java.io.IOException;

public class BadClientDependencyInversion {

	public static void main(String[] args) throws IOException {

		Message msg = new Message("This is a message");
		MessagePrinter printer = new MessagePrinter();
		printer.writeMessage(msg, "text_msg.txt");

	}

}
