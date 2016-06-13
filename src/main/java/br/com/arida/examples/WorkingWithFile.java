package br.com.arida.examples;

import java.io.File;

public class WorkingWithFile {

	public static void main(String[] args) {
		File arquivo = new File("src/main/resources/workingWithFile.txt");
	    System.out.println("Existe: " + arquivo.exists());
	    System.out.println("Nome do arquivo: " + arquivo.getName());
	    System.out.println("Tamanho em bytes: " + arquivo.length());
	}
}
