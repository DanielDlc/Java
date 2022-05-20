package application;

import java.util.Scanner;

public class Program {

	// Area of a triangle
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X: ");
		xA = input.nextDouble();
		xB = input.nextDouble();
		xC = input.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = input.nextDouble();
		yB = input.nextDouble();
		yC = input.nextDouble();
		
		// Area of triangle formula >>>  area = sqrt p(p-a)(p-b)(p-c) where p=(a+b+C)/2		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p -xB ) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p -yB ) * (p - yC));
		
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
