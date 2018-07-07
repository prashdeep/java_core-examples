package com.edureka.inheritance.demo;

public class Padietric extends Doctor {
	
	@Override
	public void treatPatient() {
		treatKids();
	}

	private void treatKids() {
		System.out.println("Treating kids");
	}

}
