package com.edureka.package1;

import com.edureka.package2.PackageTwoClass1;

public class PackageOneClass2 {
	public static void main(String[] args) {
		new PackageOneClass2().protectedMethod();
		new PackageTwoClass1().defaultMethod();
		new PackageTwoClass1().publicMethod();
	}

}
