
package com.hospitalmanagementsystem;

import java.util.*;


public class HospitalManagementSystem {
	
	
	private static String nextLineSafe(Scanner sc)
	{
		String input = sc.nextLine().trim();
		
		if(input.isEmpty())
		{
			input = sc.nextLine().trim();
		}
		
		return input;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		
		ArrayList<Patient> patients = new ArrayList<>();
		
		do {
			System.out.println("Menu");
			
			System.out.println();
			
			System.out.println("1.Add Patient");
			System.out.println("2.View Patients");
			System.out.println("3.Search Patient By Id");
			System.out.println("4.Update Patient Details");
			System.out.println("5.Exit");
			
			
			System.out.println();
			
			System.out.println("Enter choice from above menu:- ");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Add Patient");
			
			System.out.println("Enter Patient Id:- ");
			
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Patient Name:- ");
			
			
			
			String name = nextLineSafe(sc);
			
			System.out.println("Enter Patient Age:- ");
			
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Gender:- ");
			
			
			
			String gender = nextLineSafe(sc);
			
			System.out.println("Enter Disease:- ");
			
						
			String disease = nextLineSafe(sc);
			
			patients.add(new Patient(id, name, age, gender, disease));
			
			
			System.out.println("Total Patients: " + patients.size());
			
			
			break;
			
			case 2: System.out.println("View Patient");
			
				if(patients.isEmpty())
				{
					System.out.println("No patients data available");
				}
				
				else {
					for(Patient p : patients)
					{
						p.displayDetails();
						
					}
				}
			
			break;
			
			case 3: System.out.println("Search Patient By Id");
			
			if(patients.isEmpty())
			{
				System.out.println("No data available");
			}
			
			else {
				System.out.println("Enter patient id:- ");
				
				int searchPatientId = sc.nextInt();
				
				boolean found  = false;
				
				for(Patient p : patients)
				{
					if(searchPatientId == p.getPatientId())
					{
						System.out.println("The result for searched patient id is " + p.getPatientName());
						
						found = true;
						
						break;
					}
				}
				
				if(!found)
				{
				    System.out.println("Patient not found");
				}
			}

			break;

			case 4: System.out.println("Update Patient Details");
			
			if(patients.isEmpty())
			{
				System.out.println("No data found");
			}
			
			else {
				System.out.println("Enter patient id to update patient details");
				
				int searchPatientId = sc.nextInt();
				
				boolean found = false;
				
				for(Patient p : patients)
				{
					if(searchPatientId == p.getPatientId())
					{
						
						
						
						System.out.println("Update Patient Name:- ");
						
						sc.nextLine();
						
						String updatePatientName = nextLineSafe(sc);
						
						p.setPatientName(updatePatientName);
						
						System.out.println("Update Patient Age:- ");
						
						int updatePatientAge = sc.nextInt();
						sc.nextLine();
						
						p.setAge(updatePatientAge);

						
						System.out.println("Update Patient Gender:- ");
						
						
						
						String updatePatientGender = nextLineSafe(sc);
						
						p.setGender(updatePatientGender);
						
						System.out.println("Update Patient Disease:- ");
						
						//sc.nextLine();
						
						String updatePatientDisease = nextLineSafe(sc);
						
						p.setDisease(updatePatientDisease);
						
						System.out.println("Patient updated successfully");
						
						found = true;
						break;
					}
				}
				
				if(!found)
				{
					System.out.println("Patient not found");
				}
				
				
			}

			break;

			case 5: System.out.println("Exiting");

				
			
			break;
			
			
			default: System.out.println("Enter valid choice number to continue");
			
			break;
			}
			
			
		}while(choice !=5);
		
		
		
		sc.close();
		
	}
	
	
}
