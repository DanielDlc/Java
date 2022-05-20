package application;

import java.util.Scanner;

import entities.Triangle;


public class Program {

	// Area of a triangle
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = input.nextDouble();
		x.b = input.nextDouble();
		x.c = input.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = input.nextDouble();
		y.b = input.nextDouble();
		y.c = input.nextDouble();
		
		// Area of triangle formula >>>  area = sqrt p(p-a)(p-b)(p-c) where p=(a+b+C)/2		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p -x.b ) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p -y.b) * (p - y.c));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Large area: X");
		}
		else {
			System.out.println("Large area: Y");
		}
		
		input.close();
	}

}
