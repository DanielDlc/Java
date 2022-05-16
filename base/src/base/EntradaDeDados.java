package base;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		nome = sc.next();
		System.out.println("Você digitou: " + nome);
		sc.close();
		
	}

}