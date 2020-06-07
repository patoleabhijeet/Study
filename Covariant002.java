package com.apatole.polymorphism;
//Covariant child class
public class Covariant002 extends Covariant001{
	Covariant002 get() {
		return this;
	}
	
	void message() {
		System.out.println("Covariant Return type");
	}
}
