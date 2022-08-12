//Simple example on Singleton class implementation

package com.assignment.singleton;

import java.util.Scanner;

class Student1 {
	
	public int id;
	public String name;
	
	static Student1 s1 = null;
	
	private Student1() {
//		System.out.println("private constructor");
	}
	
	//factory method
	public static Student1 getObj() {
		if(s1 == null)
			s1 = new Student1();
		return s1;
	}
	
	public void display() {
		System.out.println(("ID: " + id));
		System.out.println("Name: " + name);
	}
}

public class SingletonExample {
	public static void main(String[] args) {
//		Student1 std = Student1.getObj();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		for(int i=0; i<n; ++i) {
			Student1 std = Student1.getObj();
			System.out.println("Enter student id and name: ");
			std.id = sc.nextInt();
			std.name = sc.next();
			
			System.out.println("Details are: ");
			std.display();
			System.out.println();
		}
	}
}
