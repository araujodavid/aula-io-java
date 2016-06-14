package br.com.arida.examples;

import java.io.File;

public class ReadFilesDirectory {

	public static void main(String[] args) {
		File diretorio = new File("src/main/resources");
	    if (diretorio.isDirectory()) {
	    	for (String nomeDoArquivo : diretorio.list()) {
	    		String caminho = diretorio.getPath();
	    		File arquivo = new File(caminho + "/" + nomeDoArquivo);
	    		if (arquivo.isFile()) {
	    			System.out.print(arquivo.getName() + " > ");
	    			long tamanhoEmMB = arquivo.length() / 1024;
	    			System.out.println(tamanhoEmMB + " MB");
	    		}
	    	}
	    } else {
			System.out.println("Invalid directory!!");
		}    
	}
}
