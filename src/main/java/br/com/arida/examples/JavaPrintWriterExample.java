package br.com.arida.examples;

import java.io.File;
import java.io.PrintWriter;
import java.util.Locale;

public class JavaPrintWriterExample {

	public static void main(String[] args) {
		
		String s = "PrintWriter";
	    int i = 50;	    
	    
	    try {         
	         
	    	File file = new File("src/main/resources/output.txt");        

	        PrintWriter pw = new PrintWriter(file);
		
	        // format text with specified locale.
	        // %s indicates a string will be placed there, which is s
	        pw.format(Locale.US, "This is a %s example", s);

	        // usage line.separator
	        pw.println();

	        // write integer
	        pw.println(i);

	        // write character
	        pw.write(i);

	        // usage line.separator
	        pw.println();
	         
	        // format text with specified locale
	        // %d indicates a integer will be placed there, which is 100
	        pw.format("This is a %s example with %d", s, i);
	        
	        System.out.println();        
	        System.out.println("Data written to the file successfully");
	        // flush the writer
	        pw.flush();
	        
	        PrintWriter pw1 = new PrintWriter(System.out);
	        pw1.println();
	        pw1.println("Data on console : ");
	        pw1.format(Locale.US, "This is a %s example", s);
	        pw1.println();
	        pw1.println(i);
	        pw1.write(i);
	        pw1.println();
	        pw1.format("This is a %s example with %d", s, i);
	        pw1.println();
	        pw1.flush();
	   } catch (Exception ex) {
		   System.out.println(ex);
	   }
	}
}