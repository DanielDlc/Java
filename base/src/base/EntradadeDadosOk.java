package base;

import java.util.Scanner;

public class EntradadeDadosOk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		
		nome = sc.next();
		idade = sc.nextInt();
		salario = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(salario);

		sc.close();
		
		
		

	}

}
