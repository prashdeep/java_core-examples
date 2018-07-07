package com.edureka.contract;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	
	public static void main(String[] args) {
		String[] names = {"Pradeep", "Praveen", "Kiran"};
		List<String> list = Arrays.asList(names);
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
