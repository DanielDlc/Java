package application;

import java.util.Scanner;
import entities.Product;

public class ProrgamProduct {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = input.nextLine();
		
		System.out.print("Price: ");
		product.price = input.nextDouble();
		
		System.out.println("Quantity in stock: ");		
		product.quantity = input.nextInt();
		
		System.out.println(product);
		
		input.close();

	}

}
