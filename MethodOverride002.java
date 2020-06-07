package com.apatole.polymorphism;
//Child class for methodVOerride
public class MethodOverride002 extends MethodOverride001{
	int AdditionofNumber (int a,int b) {
		System.out.println("Method invoked from child class");
		int c=a+b;
		return c;
	}
	
}
