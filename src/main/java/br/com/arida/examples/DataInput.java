package br.com.arida.examples;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInput {

	public static void main(String[] args) throws IOException {
		
		//Lê o arquivo dataOutput.txt
		DataInputStream in = new DataInputStream(new FileInputStream("src/main/resources/dataOutput.txt"));
		
		double price; 
		int unit; 
		StringBuffer desc = null; 
		double total = 0.0;  
		char chr;
		
		try {
		    while (true) {
		        price = in.readDouble();
		        in.readChar(); //Pula tabulação
		        unit = in.readInt();
		        in.readChar(); //Pula tabulação
		        desc = new StringBuffer(20);
		        char lineSep = System.getProperty("line.separator").charAt(0);

		        while ((chr = in.readChar()) != lineSep) {
		            desc.append(chr);
		        }

		        System.out.println("Pedido com " + unit +  " unidade(s) de " + desc + " por R$ " + price);
		        total = total + unit * price;
		    }    
		} catch (EOFException e) { }
		
		System.out.println("Por um total de: R$ " + total);
		in.close();
	}
}