package com.example.demo;

public abstract class AbstractClass {

	public abstract void getData();
	
	public static void printData() {
		System.out.println("Parent clas running..");
	}
	
	public static void main(String[] args) {
		System.out.println("MAIN");
		AbstractClass obj = new ChildClass();
        obj.getData();
        System.out.println("MAIN finished");
	}
}
