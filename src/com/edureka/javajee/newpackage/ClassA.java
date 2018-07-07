package com.edureka.javajee.newpackage;


public class ClassA extends com.edureka.javajee.packages.ClassA{
	
	public static void main(String[] args) {
		com.edureka.javajee.packages.ClassA obj = new com.edureka.javajee.packages.ClassA();
		ClassA objA = new ClassA();
		System.out.println(objA.protectedValue);;
		System.out.println(objA.publicVariable);
	}

}
