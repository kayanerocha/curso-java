package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {
	
	/*
	 * Exercício 2
	 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida,
	 * mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário com base
	 * em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os
	 * dados do funcionário.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: " + employee);
		
		System.out.print("\nWich percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println("\nUpdated data: " + employee);
		
		sc.close();

	}

}
