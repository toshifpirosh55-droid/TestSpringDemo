package com.example.demo;

public class ChildClass extends AbstractClass{

	@Override
	public void getData() {
		System.out.println("Child class running.");
		
	}
	
	public static void main(String[] args) {
		AbstractClass.printData();
	}
	
	private void printNewData() {
		AbstractClass.printData();
	}
	
}
