package br.com.arida.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("src/main/resources/fileFrom.txt");
		System.out.println("From bytes: " + inputFile.length());
		File outputFile = new File("src/main/resources/fileTo.txt");
		System.out.println("To bytes: " + outputFile.length());

		FileInputStream in = new FileInputStream(inputFile);
		FileOutputStream out = new FileOutputStream(outputFile);
		
		int nextByte;

		System.out.println("Copiando...");
		while ((nextByte = in.read()) != -1) {
			out.write(nextByte);
		}

		in.close();
		out.close();
		
		System.out.println("To bytes: " + outputFile.length());
	}
}