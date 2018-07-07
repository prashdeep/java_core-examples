package com.edureka.inheritance;

public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		//Reference = new Object
		// Object = IS A
		
		//Doctor doctor = new Doctor();
		Ortho ortho = new Ortho();
		Padietric padietric = new Padietric();
		KneeSurgeon kneeSurgeon = new KneeSurgeon();
		HipSurgeon hipSurgeon = new HipSurgeon();
		
		//Tricky versions
		Doctor doc1 = new Ortho();
		Doctor doc2 = new Padietric();
		Doctor doc3 = new HipSurgeon();
		Doctor doc4 = new KneeSurgeon();
		
		//Next set of tricky versions
		/*Ortho ortho1 = new Padietric();
		Padietric padietric1 = new Ortho();
		Ortho ortho2 = new Doctor();*/
		
		// even more trickier
		//doctor.treatPatient();
		//doc1.treatPatient();
		////ortho.conductCTScan();
		//doc2.treatPatient();
		
		Doctor kneeSurgeon1 = new KneeSurgeon();
		kneeSurgeon1.treatPatient();
	}
}
