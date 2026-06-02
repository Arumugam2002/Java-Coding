package com.result;

public class Student {
		
	String name;
	int rollNo;
	int totalMarks;
	
	
	public Student(String name, int rollNo, int totalMarks)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.totalMarks = totalMarks;
	}
	
	public double calculatePercentage()
	{
		double result = (totalMarks / 300.0) * 100;
		
		return result;
	}
	
	public String getGrade()
	{
		double percentage = calculatePercentage();
		
		if(percentage >= 90)
		{
			return "A+";
		}
		
		else if(percentage >= 80)
		{
			return "A";
			
		}
		
		else if(percentage >= 70)
		{
			return "B+";
		}
		
		else if(percentage >= 60)
		{
			return "B";
		}
		
		else if(percentage >= 50)
		{
			return "C";
		}
		
		else if(percentage >= 35)
		{
			return "D";
		}
		
		else {
			return "F";
		}
	}
}
