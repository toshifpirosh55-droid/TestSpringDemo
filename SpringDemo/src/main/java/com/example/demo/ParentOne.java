package com.example.demo;

public interface ParentOne {
	default void msg() {
		System.out.println("Parent One");
	}
}
