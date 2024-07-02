package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentInfo")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	String name,dep;
	
	public Student() {
		
	}
	public Student(String name, String dep) {
		super();
		this.name = name;
		this.dep = dep;
	
}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDep() {
		return dep;
	}


	public void setDep(String dep) {
		this.dep = dep;
	}


	
	
}