package com.edureka.concurrency;

public class Printer {

	public  void print(String name ) {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("printing i  for Thread "+i+" Thread name : "+name);
		}
	}
}
