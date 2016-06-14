package br.com.arida.examples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializedMyClass {

	public static void main(String[] args) {
		
		try {
		      FileInputStream fi = new FileInputStream("src/main/resources/classe.tmp");
		      ObjectInputStream oi = new ObjectInputStream(fi);
		      
		      Object o = oi.readObject();
		      
		      MyClass a = (MyClass) o;
		      System.out.println(a.getMaisOutroNome());    	
		      System.out.println(a.getNome());
		      System.out.println(a.getOutroNome());
		      
		      oi.close();
		      fi.close();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	}
}