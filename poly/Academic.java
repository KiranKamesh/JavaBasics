package com.training.poly;

public class Academic extends Payroll{
	private String name;
	private int salary;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		if(salary>150000) {
			return 140000;
		}else {
			return this.adjustSalary();
		}
		
		
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	int adjustSalary() {
		return 150000;
	}
	public void giveLecture() {
		System.out.println("giving lecture");
	}
}
