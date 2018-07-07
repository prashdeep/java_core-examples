package com.edureka.exception;

import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		int[] numbers = { 23, 24, 34, 56, 77, 88, 0 };
		int index1 = 0;
		int index2 = 0;
		System.out.println("Please enter first number between 0 and " + (numbers.length - 1));
		Scanner sc = new Scanner(System.in);
		try {
			index1 = sc.nextInt();
			System.out.println("Please enter the second number between 0 and " + (numbers.length - 1));
			index2 = sc.nextInt();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception");
		}
		try {
			System.out.println("The division of both numbers is  " + (numbers[index1] / numbers[index2]));
		} catch (ArithmeticException e) {
			System.out.println("Please enter the number between 0 and " + (numbers.length - 1));
		} finally {
			System.out.println("Excecuted always: If or not the Excpetion is thrown");
			sc.close();
		}
	}

}
