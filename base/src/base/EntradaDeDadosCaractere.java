package base;

import java.util.Scanner;

public class EntradaDeDadosCaractere {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char caracter;
		caracter = sc.next().charAt(0);
		System.out.println("Você digitou: " + caracter);
		
		sc.close();
	}

}
