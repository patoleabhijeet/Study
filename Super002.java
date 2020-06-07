package com.apatole.polymorphism;
//Child class for Super
public class Super002 extends Super001{
	String color="White";
	
	void PrintColor() {
		System.out.println("Color of Super002 is "+ color);
		System.out.println("Color of Super001 is "+ super.color);
	}
	
}
