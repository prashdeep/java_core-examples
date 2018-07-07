package com.edureka.concurrency.threads;

public class BasicThreadDemo extends Thread {

	public static void main(String[] args) throws InterruptedException {

		Thread thread = new BasicThreadDemo();
		thread.setName("Child thread");
		thread.start();
		System.out.println("The next statement will be printed after 5 seconds");
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().join(10000);
		System.out.println("Waiting for other threads to complete the job");
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("The name of the child thread is " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
