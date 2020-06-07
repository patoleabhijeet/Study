package com.apatole.polymorphism;
//Examples of meothd OverLoading

public class MethodOverload001 {
	static int PolyMorph(int a, int b) {
		System.out.println("Original Method");
		int c = a+b;
		return c;
	}
	
	static int PolyMorph(int a, int b, int c) {
		System.out.println("Change in number of parameters");
		int d=a+b+c;
		return d;
	}
	
	static double PolyMorph(int a, double b) {
		System.out.println("Change in type and return of parameters");
		double c=a+b;
		return c;
	}
	
	public static void main(String a[]) {
		int result1=PolyMorph(10,'x');
		System.out.println(result1);
		int result2=PolyMorph(10,20,30);
		System.out.println(result2);
		double result3=PolyMorph(10,20.4);
		System.out.println(result3);		
	}
}
