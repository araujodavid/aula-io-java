package br.com.arida.examples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadingLines {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new  FileInputStream("src/main/resources/fileFrom.txt");
		    InputStreamReader ir = new InputStreamReader(fi);
		    BufferedReader br = new BufferedReader(ir);
		    String linha;
		    
		    while ((linha = br.readLine()) != null) {
		    	System.out.println(linha);
		    }
		    
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
}