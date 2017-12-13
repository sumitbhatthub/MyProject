package com.Objects;

public class Employee {
	
	String Name;
	double salary;
	String Designation;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", salary=" + salary + ", Designation=" + Designation + "]";
	}
	


}
