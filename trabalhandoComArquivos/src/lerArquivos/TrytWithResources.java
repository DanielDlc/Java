package lerArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TrytWithResources {

public static void main(String[] args) {
		
     	// choose temporary directory ->   c:\\temp\\in.txt
		String path = "c:\\Users\\sharm\\dev\\Java\\trabalhandoComArquivos\\src\\in.txt";
		
		// instantiating String directly in try block
		try (BufferedReader buffer = new BufferedReader(new FileReader(path))) {
			String line = buffer.readLine();
			
			while (line != null ) {
				System.out.println(line);
				line = buffer.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getLocalizedMessage());
		}
	}
}
