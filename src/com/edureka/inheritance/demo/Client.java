package com.edureka.inheritance.demo;

public class Client {

	public static void main(String[] args) {

		// ChildClass child = new ChildClass();
		Doctor padietric = new Ortho();
		
		Padietric pedietric2 = new Padietric();

		Padietric pd2 = pedietric2;
		//Padietric pd = (Padietric) padietric;
		
		pedietric2.treatPatient();
		
		//AbstractDemo obj = new AbstractDemo();

	}
}
