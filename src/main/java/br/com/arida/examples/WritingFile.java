package br.com.arida.examples;

import java.io.File;
import java.io.FileOutputStream;

public class WritingFile {

	public static void main(String[] args) {
		try {
			File file = new File("src/main/resources/workingWithFile.txt");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			String texto = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
			texto = texto.concat("\nLorem Ipsum has been the industry's standard dummy text ever since the 1500s.");
			fileOutputStream.write(texto.getBytes());
			fileOutputStream.close();
			System.out.println("The file was successfully saved!");
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}	
}