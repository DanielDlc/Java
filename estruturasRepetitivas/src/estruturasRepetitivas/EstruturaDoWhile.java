package estruturasRepetitivas;

import java.util.Scanner;

public class EstruturaDoWhile {

	// mostrar temperatura em Celsius e Fahrenheit
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		char resposta;

		do {
			System.out.println("Digite a temperatura em Celsius: ");

			double celsius = input.nextDouble();
			double fahrenheit = 9 * celsius / 5.0 + 32.0;

			System.out.printf("Equivalente em Fahrenheit: %.2f%n", fahrenheit);
			System.out.println("Deseja repetir (s/n)? ");
			resposta = input.next().charAt(0);
		} while (resposta != 'n');

		input.close();

	}

}
