package com.assignment.voterId;

import java.util.Scanner;

class Person {
	public int id;
	public String name;
	public int age;
	public String city;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Person(int id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public Person() {
		super();
	}
}

public class VoterIdValidator {
	
	public static void validate(Person p) {
		if(p.age >= 18) {
			System.out.println("Eligible to vote!");
		}
		else {
			System.out.println("Not eligible to vote!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		System.out.print("Enter id: ");
		p.setId(sc.nextInt());
		System.out.print("Enter name: ");
		p.setName(sc.next());
		System.out.print("Enter age: ");
		p.setAge(sc.nextInt());
		System.out.print("Enter city: ");
		p.setCity(sc.next());
		validate(p);
	}

}
