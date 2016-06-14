package br.com.arida.examples;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileReaderWriter {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("src/main/resources/fileFrom.txt");
		System.out.println("From bytes: " + inputFile.length());
		File outputFile = new File("src/main/resources/fileTo.txt");
		System.out.println("To bytes: " + outputFile.length());

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		
		int c;

		System.out.println("Copiando...");
		while ((c = in.read()) != -1) {
			out.write(c);
		}

		in.close();
		out.close();
		
		System.out.println("To bytes: " + outputFile.length());
	}
}