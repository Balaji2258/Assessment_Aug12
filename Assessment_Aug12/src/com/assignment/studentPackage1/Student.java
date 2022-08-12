package com.assignment.studentPackage1;

public class Student {
	private int id;
	public String name;
	protected long phone;
	public double perc;
	public char grade;
	public Student() {
		super();
	}
	public Student(int id, String name, long phone, double perc) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.perc = perc;
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
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
}
