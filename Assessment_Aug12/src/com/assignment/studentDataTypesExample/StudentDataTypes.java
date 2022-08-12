package com.assignment.studentDataTypesExample;

import java.util.Scanner;

class Student {
	int id;
	String name;
	long phone;
	double perc;
	public Student(int id, String name, long phone, double perc) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.perc = perc;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getPerc() {
		return perc;
	}
	public void setPerc(double perc) {
		this.perc = perc;
	}
}

public class StudentDataTypes {
	
	public static void disp(Student std) {
		System.out.println("ID: " + std.getId());
		System.out.println("Name: " + std.getName());
		System.out.println("Phone: " + std.getPhone());
		System.out.println("Percentage: " + std.getPerc());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, name, phone, percentage of student");
		Student std = new Student(sc.nextInt(), sc.next(), sc.nextLong(), sc.nextDouble());
		System.out.println("\nStudent Details: ");
		disp(std);
	}

}
