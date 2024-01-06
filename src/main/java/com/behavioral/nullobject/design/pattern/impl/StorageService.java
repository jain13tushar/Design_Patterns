package com.behavioral.nullobject.design.pattern.impl;

import java.io.PrintWriter;

public class StorageService {

	public void save(Report report) {
		System.out.println("Writing report out");
		try (PrintWriter writer = new PrintWriter(report.getName() + ".txt")) {
			writer.println(report.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
