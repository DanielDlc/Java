package estruturasRepetitivas;

import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x  = input.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			x = input.nextInt();
		}
		
		System.out.println(soma);	
		input.close();

	}

}
