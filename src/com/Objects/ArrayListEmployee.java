package com.Objects;

import java.util.ArrayList;

public class ArrayListEmployee {
	
	public static void main(String[] args) {
		Employee E=new Employee();
		E.setName("Rohan");
		E.setSalary(20000);
		E.setDesignation("Manager");
		
		Employee E1=new Employee();
		E1.setName("Mohit");
		E1.setSalary(50000);
		E1.setDesignation("Senior Manager");
		
		Employee E3=new Employee();
		E3.setName("Mohit");
		E3.setSalary(50000);
		E3.setDesignation("Senior Lead");
		
		ArrayList<Employee> a=new ArrayList<Employee>();
		a.add(E1);
		a.add(E);
		a.add(E3);
		
		System.out.println(a.get(0).getName());
		System.out.println(a.get(2).getSalary());
	}

}
