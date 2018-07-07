package com.edureka.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class SortingOrder implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return -(o1.compareTo(o2));
	}
	
}
public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>(new SortingOrder());
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
