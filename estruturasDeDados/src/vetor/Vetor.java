package vetor;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		double [] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = input.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.println("Averange Height: " + avg );		
		
		input.close();
		
	}

}


