package com.edureka.inheritance;

public class KneeSurgeon extends Ortho {
	
	@Override
	public void treatPatient() {
		conductKneeSurgery();
	}
	
	public void conductKneeSurgery() {
		System.out.println("Conduct Knee Surgery");
	}

}
