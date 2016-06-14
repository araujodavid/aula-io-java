package br.com.arida.examples;

import java.io.File;
import java.io.PrintWriter;

public class UsingPrintWriter {

	public static void main(String[] args) {
		try {
			File file = new File("src/main/resources/usingPrintWriter.txt");
			PrintWriter p = new PrintWriter(file);
			p.print("primeira linha");
			p.println("segunda linha");
			p.write("terceira linha");
			p.close();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
}