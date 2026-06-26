package com.example.demo;

public class ImplementationClass implements ParentOne, ParentTwo {

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		ParentOne.super.msg();
		System.out.println("ImplementationClass is running.");
	}
	
	static public void main(String[] args) {
		ImplementationClass ic = new ImplementationClass();
		ic.msg();
	}
	

}
