package com.behavioral.visitor.design.pattern.impl;

public class ClientVisitor {

	public static void main(String[] args) {

		Employee emp = buildOrganization();
		Visitor visitor = new PrintVisitor();
		visitOrgStructure(emp, visitor);

	}

	private static Employee buildOrganization() {

		Programmer p1 = new Programmer("Rachel", "C++");
		Programmer p2 = new Programmer("Andy", "Java");

		Programmer p3 = new Programmer("Josh", "C#");
		Programmer p4 = new Programmer("Bill", "C++");

		ProjectLead pl1 = new ProjectLead("Tina", p1, p2);
		ProjectLead pl2 = new ProjectLead("Joey", p3, p4);

		Manager m1 = new Manager("Chad", pl1);
		Manager m2 = new Manager("Chad II", pl2);

		VicePresident vp = new VicePresident("Richad", m1, m2);

		return vp;

	}

	private static void visitOrgStructure(Employee emp, Visitor visitor) {
		emp.accept(visitor);
		emp.getDirectReports().forEach(e -> visitOrgStructure(e, visitor));

	}
}
