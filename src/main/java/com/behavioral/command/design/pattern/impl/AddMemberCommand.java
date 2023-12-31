package com.behavioral.command.design.pattern.impl;

//A Concrete implementation of Command.
public class AddMemberCommand implements Command {

	private String emailAddress;

	private String listName;

	private EWSService receiver;

	public AddMemberCommand(String email, String listName, EWSService receiver) {
		this.emailAddress = email;
		this.listName = listName;
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.addMember(emailAddress, listName);
	}

}
