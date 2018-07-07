package com.edureka.threads;

public class RunnableDemo implements Runnable {

	public static void main(String[] args) {
		
		Thread t = new Thread(new RunnableDemo());
		t.start();
		for(int i = 0; i < 10; i ++) {
			try {
				Thread.sleep(1000);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing from the "+Thread.currentThread().getName());
		}
		
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing  thread "+Thread.currentThread().getName());
		}
		
	}
}
