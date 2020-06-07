package com.apatole.polymorphism;

public class RunTime004 {
	public static void main(String a[]) {
		RunTime001 r3 = new RunTime003();
		RunTime001 r2 = new RunTime002();
		RunTime001 r1 = new RunTime001();
		r3.draw();
		r2.draw();
		r1.draw();
		System.out.println(r3.a);
		System.out.println(r1.a);
	}
}
