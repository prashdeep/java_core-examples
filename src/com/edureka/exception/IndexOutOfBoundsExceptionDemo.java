package com.edureka.exception;

import java.util.Scanner;

public class IndexOutOfBoundsExceptionDemo {
	
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Plase enter a number between 0 to 10");
		int option = sc.nextInt();
		int array[] = {11,23,14,12,45,56,32,46};
		
		System.out.println("The value for the passed index is "+array[option]);
		*/
		User user = new User();
		//user.setName("Pradeep");
		try {
			System.out.println(user.getName().toUpperCase());
		} catch(NullPointerException e) {
			System.out.println("Please ensure that user has a Name..");
		}
		
		System.out.println("This statement will only be printed if there is no excpeiton");
		
	}

}

class User{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
