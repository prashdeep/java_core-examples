package com.edureka.package1;

import com.edureka.package2.*;


public class PackageOneClass1  extends PackageTwoClass1 {
	public static void main(String[] args) {
		PackageOneClass1 obj = new PackageOneClass1();
		obj.publicMethod();
		obj.protectedMethod();
		
	}
}
