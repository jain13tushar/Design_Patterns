package com.principle.dependencyinversion.bad;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	// Accept Formatter and PrintWriter as a parameter.
	public void writeMessage(Message msg, String fileName) throws IOException {
		Formatter formatter = new JSONFormatter();
		try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
			writer.println(formatter.format(msg));
			writer.flush();
		}
	}

}
