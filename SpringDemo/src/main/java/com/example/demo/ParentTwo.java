package com.example.demo;

public interface ParentTwo {
	default void msg() {
		System.out.println("Parent Two");
	}
}
