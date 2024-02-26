package com.neosoft.digiadmin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "students")
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	
	@Column (name = "studentname")
	private String studentName;
	
	@Column (name = "age")
	private int age ;
	
	@Column (name = "address")
	private String address;
	
	@Column (name = "bloodgroup")
	private String bloodGroup;

	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(long id, String studentName, int age, String address, String bloodGroup) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.age = age;
		this.address = address;
		this.bloodGroup = bloodGroup;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	
	
	
	
	
	
	
	
	
	

}
