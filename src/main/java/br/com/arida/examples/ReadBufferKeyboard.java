package br.com.arida.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadBufferKeyboard {

	public static void main(String[] args) {		

		String buffer = " "; 
	    InputStreamReader teclado = new InputStreamReader(System.in);
	    BufferedReader bufferin = new BufferedReader(teclado);

	    while (true) { 
	    	try { 
	    		buffer = bufferin.readLine(); 
	        } catch(IOException e) { 
	        	System.out.println("Erro durante a leitura" + e); 
	        	return; 
	        } 
	        if( buffer == null ) break; 
	        System.out.println(buffer); // Mostra na tela
	     }
	}
}