package br.com.arida.examples;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) {
		
		FileOutputStream out;
		// Declara um objeto PrintStream
		PrintStream ps;
		
		try {
			// Cria um novo arquivo que conterá texto
			out = new FileOutputStream("src/main/resources/printStream.txt");

			// Conecta printstram a um outputstream
			ps = new PrintStream(out);
			ps.println("Este texto será escrito!");
			System.err.println ("Escrita OK");
			ps.close();
		} catch (Exception e){
			System.err.println("Erro durante escrita");
		}
	}
}