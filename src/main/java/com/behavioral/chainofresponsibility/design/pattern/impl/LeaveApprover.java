package com.behavioral.chainofresponsibility.design.pattern.impl;

//This represents a handler in chain of responsibility
public interface LeaveApprover {

	void processLeaveApplication(LeaveApplication leaveApplication);

	String getApproverRole();

}
