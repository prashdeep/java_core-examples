package com.edureka.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(34);
		set.add(31);
		set.add(44);
		set.add(45);
		set.add(45);
		set.add(46); 
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
