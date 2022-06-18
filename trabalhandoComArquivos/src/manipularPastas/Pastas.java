package manipularPastas;

import java.io.File;
import java.util.Scanner;

public class Pastas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = input.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		input.close();
		
	}
	
}
