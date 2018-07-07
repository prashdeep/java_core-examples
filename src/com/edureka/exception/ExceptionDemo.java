package com.edureka.exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			int i = sc.nextInt();
			System.out.println("Enter the second number");
			int j = sc.nextInt();
			System.out.println("The division of two numbers is " + (i / j));
			System.out.println("thanks for using this program. Bye !!");
		} catch (Exception e) {
			System.out.println("Please enter a valid number");
		}
		sc.close();
	}

}
