package tryCatch;

import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("digitar o nome e após o enter, digitar o número da posição:");
		
		try {
		    String[] vect = input.nextLine().split(" ");
		    int position = input.nextInt();
		    System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("Posição inválida!");
		}
		
		System.out.println("Fim do programa.");
		input.close();
		
	}
	
}
