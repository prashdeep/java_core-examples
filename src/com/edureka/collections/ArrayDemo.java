package com.edureka.collections;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] items = { 3, 4, 2, 3, 5 };
		for (int i = 0; i < items.length; i++) {
			if (items[i] == 6) {
				System.out.println("Array contains 6");
				break;
			}
			continue;
		}
		
	}
	
}
