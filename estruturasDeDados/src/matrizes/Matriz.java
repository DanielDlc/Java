package matrizes;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < n; i++) {        // percorrer as linhas da matriz
			for (int j =0; j < n; j++) {    // percorrer as colunas (favor, ignorar complexidade)
				mat[i][j] = input.nextInt();
			}
		}
		
		// exibir diagonal princial da matriz
		System.out.println("Main diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		// calcular a quantidade de números negativos
		int count = 0;
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++ ) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative Numbers = " + count);
	
		input.close();
		
	}

}
