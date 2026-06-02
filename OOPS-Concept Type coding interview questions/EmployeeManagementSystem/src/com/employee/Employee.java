package com.employee;

public class Employee {

	int empId;
	String name;
	
	double salary;
	
	public Employee(int empId, String name, double salary)
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		
		
	}
	
	public double increaseSalary()
	{
		
		
		salary = salary + (salary * 10/100);
		
		return salary;
	}
	
}
