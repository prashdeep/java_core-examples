package com.edureka.inheritance;

public class Ortho extends Doctor {
	
	@Override
	public void treatPatient() {
		conductXRay();
		conductCTScan();
	}
	
	public void conductXRay() {
		System.out.println("Conducting X- Ray");
	}
	
	public void conductCTScan() {
		System.out.println("Condicting CT Scan");
	}

}
