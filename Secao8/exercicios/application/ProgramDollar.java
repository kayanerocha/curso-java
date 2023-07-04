package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramDollar {
	
	/*
	 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma
	 * pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a
	 * pessoa terá que pagar 6% de IOD sobre o valor em dólar. Criar uma classe CurrencyConverter para ser
	 * responsável pelos cálculos.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double value = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.aumontPaid(price, value));
		
		sc.close();

	}

}
