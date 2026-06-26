package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype") --this means object will be created only when we call getBean()
public class Employee {
	
	private int employeeId;
	private String name;
	
	@Autowired
	private Laptop laptop;
	
	public Employee() {
		System.out.println("Employee constructor called...");

	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void showDetails() {
		System.out.println("In method show...");
		laptop.compile();
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
}
