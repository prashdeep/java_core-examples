package com.edureka.concurrency;

public class PrinterClient {
	public static void main(String[] args) {
		//only one instance of Printer
		Printer printer = new Printer();
		Thread job1 = new Thread(new PrinterJob(printer), "John");
		Thread job2 = new Thread(new PrinterJob(printer), "Mike");
		job1.start();
		job2.start();
		
		
	}

}
