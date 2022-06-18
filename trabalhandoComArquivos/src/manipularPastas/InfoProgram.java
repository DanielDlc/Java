package manipularPastas;

import java.io.File;
import java.util.Scanner;

public class InfoProgram {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String stdPath = sc.nextLine();
		
		File path = new File(stdPath);
		
		System.out.println("Caminho do arquivo com o nome do arquivo: " + path.getPath());
		System.out.println("Caminho do arquivo sem o nome: " + path.getParent());
		System.out.println("nome do arquivo: " + path.getName());
		
		sc.close();
	}
	
}
