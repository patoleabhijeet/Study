package com.apatole.polymorphism;

public class InstanceOf001 {
	public static void main(String a[]) {
		RunTime001 r1= new RunTime001();
		RunTime001 r2 = new RunTime002();
		System.out.println(r1 instanceof RunTime001);
		System.out.println(r2 instanceof RunTime001);
		System.out.println(r2 instanceof RunTime002);
		System.out.println(r1 instanceof RunTime002);
	}
}
