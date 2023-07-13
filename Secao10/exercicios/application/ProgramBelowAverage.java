package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBelowAverage {
	
	/*
	 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de
	 * todos elementos com três decimais. Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double numbers[] = new double[n];
		
		for (int i=0; i<numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextDouble();
		}
		
		double avg = 0;
		for (int i=0; i<numbers.length; i++) {
			avg += numbers[i];
		}
		avg = avg / numbers.length;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f%n", avg);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] < avg) {
				System.out.println(numbers[i]);
			}
		}
		
		sc.close();

	}

}
