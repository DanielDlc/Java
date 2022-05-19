package progOrientadaObjeto;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int higher = max(a, b, c);
		showResult(higher);
		
		input.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
			System.out.println("x é maior");
		}
		else if (y > z) {
			aux = y;
			System.out.println("y é maior");

		}
		else {
			aux = z;
			System.out.println("z é maior");

		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
