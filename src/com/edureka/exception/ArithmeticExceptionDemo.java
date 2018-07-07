package com.edureka.exception;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		int array[] = { 34, 56, 43, 12, 4, 5, 67, 78, 0 };
		System.out.println("Please enter two numbers..");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		try {
			System.out.println("The division of two number is " + (array[number1] / array[number2]));
		} catch (ArithmeticException e) {
			System.out.println("The second number cannot be zero ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter the number between 0 and 8");
		} catch (RuntimeException e) {
			System.out.println("There is some issue with the provided input. Please enter correct values.");
		} finally {
			System.out.println("This statement inside finally block will execute for all conditions..");
			sc.close();
		}
		
	}
}
