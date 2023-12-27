package com.structural.adapterclass.design.pattern.impl;

public class ClientAdapterClass {

	public static void main(String[] args) {

		/** Using Class/Two-way adapter **/
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		populateEmployeeData(adapter);
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card = designer.designCard(adapter);
		System.out.println(card);
		/** Using Object adapter **/
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Tushar Jain");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}

}
