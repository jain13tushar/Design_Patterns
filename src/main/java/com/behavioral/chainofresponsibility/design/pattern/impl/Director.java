package com.behavioral.chainofresponsibility.design.pattern.impl;

import com.behavioral.chainofresponsibility.design.pattern.impl.LeaveApplication.Type;

//A concrete handler
public class Director extends Employee {

	public Director(LeaveApprover nextApprover) {
		super("Director", nextApprover);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		// type is sick leave & duration is less than or equal to 2 days
		if (application.getType() == Type.PTO) {
			application.approve(getApproverRole());
			return true;
		}
		return false;
	}

}
