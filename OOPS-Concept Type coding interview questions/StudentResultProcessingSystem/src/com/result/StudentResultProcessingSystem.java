package com.result;
import java.util.*;



public class StudentResultProcessingSystem {

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		
		
		int choice;
		
		
		do 
		{
			System.out.println("Menu");
			
			System.out.println("1.Add student");
			System.out.println("2.Calculate Percentage");
			System.out.println("3.Display Grade");
			System.out.println("4.Display Topper Student");
			System.out.println("5.Exit");
			
			System.out.println("Enter choice: ");
			
			
			choice = sc.nextInt();
			
			
			
			
			switch(choice)
			{
			
				
			
			case 1: System.out.println("Enter name: ");
					sc.nextLine(); // New line
					
					String name = sc.nextLine();
					
					System.out.println("Enter Roll No: ");
					int rollNo = sc.nextInt();
					
					System.out.println("Enter Marks of Maths: ");
					int maths = sc.nextInt();
					
					System.out.println("Enter Marks of Science: ");
					int science = sc.nextInt();
					
					System.out.println("Enter Marks of English: ");
					int english = sc.nextInt();
					
					int totalMarks = maths + science + english;
					
					students.add(new Student(name, rollNo, totalMarks));
					
					System.out.println("Student Added Successfully");
					
					
			
			break;
			
			case 2: System.out.println("Calculate Percentage");
			
					if(students.isEmpty())
					{
						System.out.println("No students data is available");
					}
					
					else {
						
						for(Student s : students)
						{
							System.out.println("Name: " + s.name + ", Percentage: " + s.calculatePercentage() + "%");
						}
					}
			
			break;
			
			case 3: System.out.println("Display Grade");
			
					if(students.isEmpty())
					{
						System.out.println("No students data is available");
					}
					
					else {
						for(Student s : students)
						{
							System.out.println("Name: " + s.name + ", Roll No:- " + s.rollNo + ", Grade:- " + s.getGrade());
						}
					}
			
			break;
			
			case 4: System.out.println("Display Topper Student");
			
				if(students.isEmpty())
				{
					System.out.println("No students available");
					
				}
				
				else {
					Student topperStudent = students.get(0);
					
					for(Student s : students)
					{
						if(s.totalMarks > topperStudent.totalMarks)
						{
							topperStudent = s;
						}
					}
					
					System.out.println("\nTopper Details");
					
					System.out.println("Name:- " + topperStudent.name);
					System.out.println("Roll No:- " + topperStudent.rollNo);
					System.out.println("Total Marks:- " + topperStudent.totalMarks);
					System.out.println("Percentage:- " + topperStudent.calculatePercentage());
					System.out.println("Grade:- " + topperStudent.getGrade());
				}
			
			break;
			
			case 5: System.out.println("Exit");
			break;
			
			
			default: System.out.println("Invalid choice number, please input correct choice");
			break;
			}
		} while(choice != 5);
		
		sc.close();
		
	}
	
	
	
	
}
