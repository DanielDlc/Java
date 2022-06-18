package manipularPastas;

import java.io.File;
import java.util.Scanner;

public class Arquivos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = input.nextLine();
		
		File path = new File(strPath);
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		input.close();
		
	}
	
}
