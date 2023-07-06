package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProducts {
	
	/*
	 * Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N produtos. Armazene os N produtos em um vetor.
	 * Em seguida, mostrar o preço médio dos produtos.
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		Product[] products = new Product[n];
		
		for (int i=0; i<products.length; i++) {
			String name = sc.nextLine();
			double price = sc.nextDouble();
			sc.nextLine();
			
 			products[i] = new Product(name, price);			
		}
		
		double sum = 0;
		for (int i=0; i<products.length; i++) {
			sum += products[i].getPrice();
		}
		
		double avg = sum / products.length;
		
		System.out.printf("AVERAGE PRICE = %.2f", avg);
		
		sc.close();
		
	}

}
