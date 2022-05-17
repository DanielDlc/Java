package estruturaCondicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		System.out.println("Favor digitar dias da semana de 1 até 7: ");
		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break; 
		default:
			dia = "você utilizou o valor inválido. \nO valor não pode ser acima de 7 pois só existem 7 dias na semana";
			break;
		}

		System.out.println("Dia da semana: " + dia);
		input.close();

	}

}
