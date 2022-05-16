package base;

import java.util.Scanner;

public class EntradaDeDadosFloat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero;
		numero = sc.nextDouble();
		System.out.printf("O número digitado foi: %.3f%n", numero);
		
		sc.close();
		

	}

}
