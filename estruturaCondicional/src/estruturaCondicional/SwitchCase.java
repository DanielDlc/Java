package estruturaCondicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		System.out.println("Favor digitar dias da semana de 1 at� 7: ");
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
			dia = "ter�a";
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
			dia = "s�bado";
			break; 
		default:
			dia = "voc� utilizou o valor inv�lido. \nO valor n�o pode ser acima de 7 pois s� existem 7 dias na semana";
			break;
		}

		System.out.println("Dia da semana: " + dia);
		input.close();

	}

}
