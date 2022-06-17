package lerArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeituraDeArquivos {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\sharm\\dev\\Java\\trabalhandoComArquivos\\src\\in.txt");
		Scanner input = null;
		try {
			input = new Scanner(file);
			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (input != null) {
				input.close();				
			}
		}
	}
}
