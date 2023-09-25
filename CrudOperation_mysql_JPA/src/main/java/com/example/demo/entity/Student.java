/**
 * 
 */
package com.example.demo.entity;
 import jakarta.persistence.*;
/**
 * 
 */
 @Entity
public class Student {
	 @Id
	 private int rollNo;
	 private String name;
	 private String address;
	 public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + name + ", Address=" + this.address + "]";
	}
	
	 public Student(int rollNo, String name, String address) {
			super();
			this.rollNo = rollNo;
			this.name = name;
			this.address = address;
		}
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
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
