package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US); 
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat(" dd/MM/yyyy");
		
		System.out.println("Enter department's name: ");
		String departmentName = input.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String workerName = input.nextLine();

		System.out.println("Level: ");
		String workerLevel = input.nextLine();
		
		System.out.println("Base salary: ");
		double baseSalary = input.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println("How many contracts to this worker? ");
		int n = input.nextInt();
		
		// the for loop will repeat until instantiating and binding to worker.
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(input.next());			
			System.out.print("Value per hour: ");
			double valuePerHour = input.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = input.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		
		input.close();
		
	}
	
}
