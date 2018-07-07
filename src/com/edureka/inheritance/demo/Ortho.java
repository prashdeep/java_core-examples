package com.edureka.inheritance.demo;

public class Ortho extends Doctor {
	
	public void treatPatient(){
		conductXRay();
		conductCTScan();
	}

	private void conductCTScan() {
		System.out.println("Conduct CT Scan");
	}

	private void conductXRay() {
		System.out.println("Conduct X Ray");
	}

}
