package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSum {
	
	/*
	 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
	 * - Imprimir todos os elementos do vetor
	 * - Mostrar na tela a soma e a média dos elementos do vetor
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double numbers[] = new double[n];
		
		for (int i=0; i<numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextDouble();
		}
		
		double soma = 0;
		System.out.print("VALORES = ");
		for (int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			soma += numbers[i];
		}
		
		double avg = soma / numbers.length;
		
		System.out.printf("%nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f", avg);
		
		sc.close();

	}

}
