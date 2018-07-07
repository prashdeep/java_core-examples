package com.edureka.collections.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(34, "Hello");
		map.put(45, "Hello");
		map.put(38, "Testing");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		//map.clear();
		map.put(34, "New Value");
		Iterator<Map.Entry<Integer, String>> entries = entrySet.iterator();
		
		while(entries.hasNext()) {
			Entry<Integer,String> entry = entries.next();
			System.out.println("Key >> " +entry.getKey()+ " value >> "+entry.getValue()) ;
		}
		
		
	}

}
