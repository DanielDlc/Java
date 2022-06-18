package escreverArquivos;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		
		
		// choose temporary directory ->   c:\\temp\\out.txt
		String path = "c:\\Users\\sharm\\dev\\Java\\trabalhandoComArquivos\\src\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
				
			}
		}
		catch (IOException e ) {
			e.printStackTrace();
		}
		
	}
	
}
