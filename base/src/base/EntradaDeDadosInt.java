package base;

import java.util.Scanner;

public class EntradaDeDadosInt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		numero = sc.nextInt();
		System.out.println("Você digitou o número: " + numero);
		
		sc.close();

	}

}
