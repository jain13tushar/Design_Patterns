package com.principle.dependencyinversion.good;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GoodClientDependencyInversion {

	public static void main(String[] args) throws IOException {

		Message msg = new Message("This is a message");
		MessagePrinter printer = new MessagePrinter();
		try (PrintWriter writer = new PrintWriter(new FileWriter("text_msg.txt"))) {
			printer.writeMessage(msg, new JSONFormatter(), writer);
		}

	}

}
