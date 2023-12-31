package com.behavioral.chainofresponsibility.design.pattern.impl;

import java.time.LocalDate;

import com.behavioral.chainofresponsibility.design.pattern.impl.LeaveApplication.Type;

public class ClientChainOfResponsibility {

	public static void main(String[] args) {

		LeaveApplication application = LeaveApplication.getBuilder().withType(Type.Sick).from(LocalDate.now())
				.to(LocalDate.of(2024, 01, 10)).build();
		System.out.println(application);
		System.out.println("**************************");
		LeaveApprover approver = createChain();
		approver.processLeaveApplication(application);
		System.out.println(application);

	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);
		return lead;
	}

}
