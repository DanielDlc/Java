package progPagamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgPrincipal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsource (y/n)?");
			char ch = input.next().charAt(0);
			System.out.println("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.println("Hours: ");
			int hours = input.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = input.nextDouble();
			if (ch == 'y') {
				System.out.println("additional charge: ");
				double additionalCharge = input.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		input.close();
		
	}
		
}
