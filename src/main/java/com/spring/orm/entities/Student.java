package com.spring.orm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	// If you remove @Id Annotation, The code won't work. So don't remove.
	@Id
	private int rollNo;
	private String name;
	private String city;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(int rollNo, String name, String city) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", city=" + city + "]";
	}

}
