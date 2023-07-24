package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ProgramWorker {
	
	/*
	 * Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar do usuário um mês e mostrar qual foi o salário
	 * do funcionário nesse mês.
	 */
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		Department department = new Department(departmentName);
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(name, level, baseSalary, department);
		
		System.out.print("How many contracts to this worker? ");
		int countContracts = sc.nextInt();
		sc.nextLine();
		for (int i=1; i<=countContracts; i++) {
			System.out.println("Enter contract #" + i + " data:");
			
			System.out.print("Date (DD/MM/YYYY): ");
			String contractDate = sc.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse(contractDate);
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();
			sc.nextLine();			
			
			worker.addContract(new HourContract(date, valuePerHour, duration));
		}
		
		System.out.println();
		System.out.print("How month and year to calculate income (MM/YYYY): ");
		String dateIncome = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
		Date date = sdf.parse(dateIncome);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		double income = worker.income(c.get(Calendar.YEAR), c.get(Calendar.MONTH));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + sdf.format(date) + ": " + String.format("%.2f", income));
		
		sc.close();

	}

}
