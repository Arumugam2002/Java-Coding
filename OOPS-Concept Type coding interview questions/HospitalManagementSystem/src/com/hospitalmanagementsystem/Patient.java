package com.hospitalmanagementsystem;

public class Patient {

	
	private int patientId;
	private String patientName;
	private int patientAge;
	private String patientGender;
	private String patientDisease;
	
	
	
	public Patient(int patientId, String patientName, int patientAge, String patientGender, String patientDisease) {
		
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientDisease = patientDisease;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return patientAge;
	}
	public void setAge(int age) {
		this.patientAge = age;
	}
	public String getGender() {
		return patientGender;
	}
	public void setGender(String gender) {
		this.patientGender = gender;
	}
	public String getDisease() {
		return patientDisease;
	}
	public void setDisease(String disease) {
		this.patientDisease = disease;
	}
	
	
	public void displayDetails()
	{
		System.out.println("Patient Id:- " + getPatientId());
		System.out.println("Patient Name:- " + getPatientName());
		System.out.println("Patient Age:- " + getAge());
		System.out.println("Patient Gender:- " + getGender());
		System.out.println("Patient Disease:- " + getDisease());
		
		System.out.println();
	}
	
	
}
