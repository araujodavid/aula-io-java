package br.com.arida.examples;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutput {

	public static void main(String[] args) throws IOException {
		
		char lineSep = System.getProperty("line.separator").charAt(0);
		 
		//Cria arquivo dataOutput.txt
		DataOutputStream out = new DataOutputStream(new FileOutputStream("src/main/resources/dataOutput.txt"));
		
		double[] prices = { 19.99, 9.99, 15.99};
		
		int[] units = { 12, 8, 13 };
		
		String[] descs = { "Camisa", "Sapato", "Chaveiro" };
		        
		for (int i = 0; i < prices.length; i ++) {	
			out.writeDouble(prices[i]);   
			out.writeChar('\t');
			out.writeInt(units[i]);             	
			out.writeChar('\t');
			out.writeChars(descs[i]);
			out.writeChar(lineSep);
		}
		out.close();			
	}
}