package com.behavioral.command.design.pattern.impl;

//This class is the receiver
public class EWSService {

	// Add a new member to mailing list
	public void addMember(String contact, String contactGroup) {
		// contact exchange
		System.out.println("Added " + contact + " to " + contactGroup);
	}

	// Remove member to mailing list
	public void removeMember(String contact, String contactGroup) {
		// contact exchange
		System.out.println("Remove " + contact + " from " + contactGroup);
	}

}
