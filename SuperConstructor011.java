package com.apatole.polymorphism;
//Real usage of Super constructor
//This isemployee class
public class SuperConstructor011 extends SuperConstructor010{
	float salary;
	SuperConstructor011(int id, String name, float salary){
		super(id,name);
		this.salary=salary;
	}
	
	void display() {
		System.out.println("Details of Emplyoee is "+id+" "+name+" "+salary);
		
	}
}
