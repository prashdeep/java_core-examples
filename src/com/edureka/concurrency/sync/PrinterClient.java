package com.edureka.concurrency.sync;

public class PrinterClient {
	
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		PrinterJob akash = new PrinterJob(printer);
		PrinterJob ram = new PrinterJob(printer);
		PrinterJob vinay = new PrinterJob(printer);
		
		Thread t1 = new Thread(akash,"Akash");
		Thread t2 = new Thread(ram, "Ram");
		Thread t3 = new Thread(vinay, "Vinay");
		
		t1.start();
		t2.start();t3.
		start();
		
	}

}
