package com.edureka.customexception;

import java.util.Scanner;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name to access");
		String fileName = sc.next();
		try {
			accessFile(fileName);
		} catch(AccessPriliviligeException e) {
			System.out.println("handled  the exception");
		} finally {
			System.out.println("Excecuted if or not an exception is thrownda");
		}
		
		sc.close();
		
	}

	private static void accessFile(String fileName) throws AccessPriliviligeException{
		if (fileName.contains("data")) {
			throw new AccessPriliviligeException("You do not have access to this file");
		}
	}

}
