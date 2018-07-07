package com.edureka.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("4");
		items.add("5");
		items.add("6");
		items.add("7");
		items.add("8");
		items.add("9");
		items.add("10");
		
		//traditional for loop
		/*
		for ( int index = 0; index < items.size(); index++) {
			System.out.println(items.get(index));
		}
		*/
		
		//enhanced for loop
		/*for(String str: items) {
			System.out.println(str);
		}
		*/
		//Using Iterator
		//Iterator has two methods
		// boolean:hasNext(), string:next()
		/*Iterator<String> iterator = items.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}*/
		
		
		//ListIterator
		//both hasNext(), next(), hasPrevious() and previous() methods
		ListIterator<String> iterator = items.listIterator();
		while(iterator.hasNext()) {
			System.out.println(">>>> " +iterator.next());
		}
		
		while(iterator.hasPrevious()) {
			System.out.println("<<<< "+iterator.previous());
		}
		
	}

}
