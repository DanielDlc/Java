package vetor;

import java.util.Scanner;

import entities.Product;

public class Average {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			input.nextLine();
			String name = input.nextLine();
			double price = input.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		
		System.out.printf("Average Price = %.2f%n", avg);
		
		input.close();
		
	}
}
