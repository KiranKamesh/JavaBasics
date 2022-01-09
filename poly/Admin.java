package com.training.poly;

public class Admin extends Payroll{
	private String name;
	private int salary;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		if(name.equals("kiran") || salary>25000) {
			return 24000;
		}else {
			return this.adjustSalary();

		}
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	int adjustSalary() {
		return 25000;
	}
	
	public void doAdminStuff() {
		System.out.println("doing admin stuff");
	}

}
