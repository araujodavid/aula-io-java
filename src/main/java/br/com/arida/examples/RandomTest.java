package br.com.arida.examples;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomTest {

	public static void main(String[] args) {		

		try {
			RandomTest r = new RandomTest();
			RandomAccessFile raf = new RandomAccessFile("src/main/resources/random.txt","rw");
			
			r.escreve(raf);
			
			r.leUm(raf,2);
			
			r.escreveUm(raf,2,'x');
			
			r.leUm(raf,2);
      
			raf.close();
	    } catch(IOException ioe) {
	    	System.out.println(ioe);
	    }
	}
	
	public void escreve(RandomAccessFile raf) throws IOException {
	    char[] letras = {'a', 'b', 'c', 'd'};
	    for(int i = 0; i < letras.length; i++) {
	    	raf.writeChar(letras[i]);
	    }
	}
	
	public void leUm(RandomAccessFile raf, int pos) throws IOException {
	    raf.seek(pos);
	    System.out.println(raf.readChar());	
	}
	
	public void escreveUm(RandomAccessFile raf, int pos, char c) throws IOException {
	    raf.seek(pos);
	    raf.writeChar(c);
	}
}