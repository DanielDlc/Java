package lerArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferReader {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\sharm\\dev\\Java\\trabalhandoComArquivos\\src\\in.txt";
		FileReader file = null;
		BufferedReader buffer = null;
		
		// processo de abertura manualmente
		try {
			file = new FileReader(path);
			buffer = new BufferedReader(file);
			
			String line = buffer.readLine();
			
			while (line != null ) {
				System.out.println(line);
				line = buffer.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getLocalizedMessage());
		}
		// processo de fechar manualmente
		finally {
			try {			
			    if (buffer != null) {
				    buffer.close();
			    }
			    if (file != null) {
				    file.close();
			    }
			}
			catch (IOException e) {
			    e.printStackTrace();
			}
		}		
	}
}
