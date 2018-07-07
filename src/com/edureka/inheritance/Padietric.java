package com.edureka.inheritance;

public class Padietric extends Doctor {
	
	@Override
	public void treatPatient() {
		conductTests();
	}
	
	public void conductTests() {
		System.out.println("Conducting tests for Kids");
	}

}
