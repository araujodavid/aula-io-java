package br.com.arida.examples;

import java.io.IOException;

public class ReadKeyboardStream {

	public static void main(String[] args) throws IOException {
		char c;
		System.out.println("Informe um caracter:");
		c = (char) System.in.read();
		
		System.out.println("Primeiro caracter: " + c);
		
		int bytesProntos = System.in.available();
		
		System.out.println("Resto dos bytes: " + bytesProntos);
		
		if (bytesProntos > 0) {
			byte[] entrada = new byte[bytesProntos];
			System.in.read(entrada);
			for (int i=0; i <= entrada.length-1; i++) {
				System.out.println("Voce informou: " + (char) entrada[i]);
			} 
		}
	}
}