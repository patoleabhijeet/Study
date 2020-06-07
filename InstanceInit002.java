package com.apatole.polymorphism;

public class InstanceInit002 extends InstanceInit001{
	InstanceInit002(){
		super();
		System.out.println("Child Class Invoked");
	}
	
	{System.out.println("Instance Initializer Block invoked");}
}
