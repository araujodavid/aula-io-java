package br.com.arida.examples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyClass implements Serializable {

	private String nome;
	private String outroNome;
	private String maisOutroNome;

	public String getNome() { return nome;}
	
	public void setNome(String nome) { this.nome = nome;}
	
	public String getOutroNome() { return outroNome; }
	
	public void setOutroNome(String outroNome) {
	   this.outroNome = outroNome;
	}
	
	public String getMaisOutroNome() {
	   return maisOutroNome;
	}
	
	public void setMaisOutroNome(String maisOutroNome) {
	   this.maisOutroNome = maisOutroNome;
	}
	
	
	public static void main(String[] args) {
		try {
			MyClass a = new MyClass();
			a.setMaisOutroNome("David");
			a.setNome("Prof. Tonho");
			a.setOutroNome("Java");
		    FileOutputStream fo = new FileOutputStream("src/main/resources/classe.tmp");
		    ObjectOutputStream ou = new ObjectOutputStream(fo);
		    ou.writeObject(a);
		    ou.close();
		    fo.close();
		    System.out.println("Objeto serializado!");
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
}