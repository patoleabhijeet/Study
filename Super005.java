package com.apatole.polymorphism;
//child class for Super method
public class Super005 extends Super004{
	void Eat() {
		System.out.println("Eating Food");
	}
	void Work() {
		System.out.println("Barking");
	}
	
	void function() {
		Eat();
		super.Eat();
		Work();
	}
}
