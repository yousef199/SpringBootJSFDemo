package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "studentIDGenerator")
	@SequenceGenerator(name = "studentIDGenerator" , initialValue = 12400 , allocationSize = 1 , sequenceName = "studentid_seq" )
	private Integer studentID;
	private String name;
	private int age;
	public Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Students [studentID=" + studentID + ", name=" + name + ", age=" + age + "]";
	}
}
