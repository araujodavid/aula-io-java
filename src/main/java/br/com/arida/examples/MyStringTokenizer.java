package br.com.arida.examples;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class MyStringTokenizer {

	public static void main(String[] args) throws IOException {
		

		FileInputStream arqsai = new FileInputStream("src/main/resources/alunos.dat");
		DataInputStream arq = new DataInputStream(arqsai);

		String reg = arq.readLine();
		
		StringTokenizer registro = new StringTokenizer(reg,",");
		
		while (registro.hasMoreTokens()) {
			String campo = registro.nextToken();
			System.out.println(campo);
		}
	}
}