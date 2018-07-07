package com.edureka.collections;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassDemo {
	public static void main(String[] args) {
		Integer i1 = 34;
		Integer i2 = new Integer(34);
		Integer i3 = Integer.valueOf(34);
		Integer i4 = Integer.valueOf("34");
		Integer i5 = Integer.parseInt("34");
		
		Boolean boolean1 = true;
		Boolean boolean2 = new Boolean(true);
		Boolean boolean3 = Boolean.TRUE;
		Boolean boolean4 = Boolean.valueOf(true);
		
		System.out.println(i1.equals(i4));
		
		List items = new ArrayList();
		items.add(34);
		items.add(45);
		
		System.out.println(items.contains(3467));
		
		
	}

}
