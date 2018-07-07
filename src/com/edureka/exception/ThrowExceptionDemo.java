package com.edureka.exception;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

import com.edureka.exception.checked.MyCustomBusinessException;

public class ThrowExceptionDemo {
	
	public static void main(String[] args) {
		System.out.println("Please view the Candidates for election: ");
		System.out.println("1:   Candidate A");
		System.out.println("2:   Candidate B");
		System.out.println("3:   Candidate C");
		System.out.println("4:   Candidate D");
		System.out.println("5:   Candidate E");
		System.out.println("6:   Candidate F");
		System.out.println("7:   Candidate G");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you age");	
		int age = sc.nextInt();
		try {
		castVote(age);
		} catch(MyCustomBusinessException e) {
			throw new RuntimeErrorException(null, "The exception is wrapped with RuntimeException");
		}
		sc.close();
		
	}

	private static void castVote(int age) throws MyCustomBusinessException {
		if (age < 18) {
			throw new MyCustomBusinessException("User should be more than 18 years of age to execise vote.");
		}
	}

}
