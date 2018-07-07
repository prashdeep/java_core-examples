package com.edureka.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class PriorityOrder implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return -(o2.compareTo(o1));
	}
	
}

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(new PriorityOrder());
		queue.add(23);
		queue.add(42);
		queue.add(6);
		queue.add(78);
		
		System.out.println(queue);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.peek());
			queue.poll();
		}
	}

}
