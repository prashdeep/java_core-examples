package com.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		/*Writer writer = new FileWriter(new File("F://file-data/data.txt"));
		writer.append("\nHello world from FileWriter class \n ");
		writer.append("\nAnother line is inserted");
		writer.append("\nHello world from FileWriter class \n ");
		writer.append("\nAnother line is inserted");
		writer.append("\nHello world from FileWriter class \n ");
		writer.append("\nAnother line is inserted");
		writer.close();*/
		
		BufferedReader reader = new BufferedReader(new FileReader("F://file-data/data.txt"));
		Writer writer = new FileWriter(new File("F://file-data/data-copy.txt"));
		boolean flag = true;
		while(flag) {
			String str = reader.readLine();
			if(str != null) {
				writer.write(str+"\n");
			}else {
				flag = false;
			}
			
		}
		
		reader.close();
		writer.close();
	}
	

}
