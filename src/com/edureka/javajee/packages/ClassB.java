package com.edureka.javajee.packages;

public class ClassB {
	
	public static void main(String[] args) {
		ClassA objA = new ClassA();
		//objA.privateVariable;
		System.out.println(objA.defaultValue);
		System.out.println(objA.protectedValue);
		System.out.println(objA.publicVariable);
	}
}
