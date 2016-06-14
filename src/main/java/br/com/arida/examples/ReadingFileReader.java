package br.com.arida.examples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadingFileReader {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Reader r = new FileReader("src/main/resources/fileFrom.txt");
		  	int c;
		  	while ((c = r.read()) != -1) {
			  System.out.println("Leu caracter: " + c);
		  	}
		} 
		catch (FileNotFoundException e) {
			System.out.println("fileFrom.txt não existe!");
		}
		catch (IOException e) {
			System.out.println("Erro de leitura!");
		}
	}
}