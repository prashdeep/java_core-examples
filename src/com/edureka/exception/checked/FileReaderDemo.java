package com.edureka.exception.checked;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
	
	public static void main(String[] args) throws IOException{
		String fileName = "C:\\data_files\\data.txt";
		writeToFile(fileName);
	}

	private static void writeToFile(String fileName) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:/data_files/file.txt")));
		writer.write("This is a text which will be written to the file");
		writer.close();
	}
}
