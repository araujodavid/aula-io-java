package br.com.arida.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFileStream {

	public static void main(String[] args) {

		File file = new File("src/main/resources/fileFrom.txt");
		FileInputStream fileInputStream;
		
		try {
			fileInputStream = new FileInputStream(file);
			
			int i = 0;
			
			while (i!=-1) {
				i = fileInputStream.read();
				char c = (char) i;
		        System.out.print(c);
		    }			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}