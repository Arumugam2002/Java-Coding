package com.employee;

import java.util.*;

import java.util.Scanner;

public class EmployeeManagementSystem {

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		int choice;
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		
		
		do {
			
			
			System.out.println();
			System.out.println("Menu");
			
			System.out.println("1.Add Employee");
			System.out.println("2.Display Employees");
			System.out.println("3.Find Highest paid employee");
			System.out.println("4.Increase Salary by 10%");
			
			System.out.println("5.Exit");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Add Employee");
			
					System.out.println("Enter Employee's name:- ");
					
					sc.nextLine(); //new line
					
					String employeeName = sc.nextLine();
					
					System.out.println("Enter Employee's Id:- ");
					
					int empId = sc.nextInt();
					
					System.out.println("Enter Employee's salary:- ");
					
					double salary = sc.nextDouble();
					
					employees.add(new Employee(empId, employeeName, salary));
					
					break;
					
			case 2: System.out.println("Display Employees");
			
					if(employees.isEmpty())
					{
						System.out.println("No employees data available");
					}
					
					else {
						for(Employee e : employees)
						{
							System.out.println("Name:- " + e.name + ", EmpId:- " + e.empId + ", Salary:- " + e.salary);
						}
					}
					
					
				break;
				
			case 3: System.out.println("Highest Paid Employee");
			
				if(employees.isEmpty())
				{
					System.out.println("No Employees data available");
				}
				
				else {
					
					Employee highestPaidEmployee = employees.get(0);
					
					for(Employee e : employees)
					{
						if(e.salary > highestPaidEmployee.salary)
						{
							highestPaidEmployee = e;
						}
					}
					
					System.out.println("Highest Paid Employee Details");
					
					System.out.println("Name:- " + highestPaidEmployee.name);
					System.out.println("Employee Id:- " + highestPaidEmployee.empId);
					System.out.println("Salary:- " + highestPaidEmployee.salary);
				}
				
				break;
				
			case 4: System.out.println("Increase salary by 10%");
			
			if(employees.isEmpty())
			{
				System.out.println("No Employees data available");
			}
			
			else {
				
				for(Employee e : employees)
				{
					e.increaseSalary();
					System.out.println("Employees salary increased by 10 for " + e.name + " is " + e.salary);
				}
			}
			
			break;
			
			case 5: System.out.println("Exiting");
			
			break;
			
			default: System.out.println("Enter correct choice number");
			break;
			
					
			}
			
			
		}while(choice!=5);
	}
}
