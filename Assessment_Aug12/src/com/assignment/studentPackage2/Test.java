package com.assignment.studentPackage2;

import java.util.Scanner;

import com.assignment.studentPackage1.GradePrediction;
import com.assignment.studentPackage1.Student;

public class Test {

	public static void disp(GradePrediction std) {
		System.out.println("ID: " + std.getId());
		System.out.println("Name: " + std.getName());
		System.out.println("Phone: " + std.getPhone());
		System.out.println("Percentage: " + std.getPerc());
		System.out.println("Grade: " + std.getGrade());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, name, phone, percentage of student");
//		Student std = new Student(sc.nextInt(), sc.next(), sc.nextLong(), sc.nextDouble());
		GradePrediction gd = new GradePrediction();
		gd.setId(sc.nextInt());
		gd.setName(sc.next());
		gd.setPhone(sc.nextLong());
		gd.setPerc(sc.nextDouble());
		gd.predict();
		System.out.println("\nStudent Details: ");
		disp(gd);	
	}

}
