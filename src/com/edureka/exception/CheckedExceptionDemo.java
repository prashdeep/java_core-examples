package com.edureka.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("C://data_files/data12.txt")));
			System.out.println(reader.readLine());
		} catch(FileNotFoundException e) {
			System.out.println("The file is not present. Please check the file and execute.");
		} catch(IOException e) {
			System.out.println("IO Exception");
		}
	}

}
