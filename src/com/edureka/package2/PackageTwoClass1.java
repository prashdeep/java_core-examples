package com.edureka.package2;

public class PackageTwoClass1 {
	
	
	public static void main(String[] args) {
		new PackageTwoClass1().publicMethod();
	    new PackageTwoClass1().protectedMethod();
		new PackageTwoClass1().defaultMethod();
		new PackageTwoClass1().privateMethod();
		
	}
	
	public void publicMethod() {
		System.out.println("Public access");
	}
	
	protected void protectedMethod() {
		System.out.println("Inside the protected method");
	}
	
	void defaultMethod() {
		System.out.println("Default method");
	}
	
	private void privateMethod() {
		System.out.println("Inside the private method");
	}

}
