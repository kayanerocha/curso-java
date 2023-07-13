package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHigherPosition {

	/*
	 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor (supor não haver
	 * empates). Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero).
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double numbers[] = new double[n];
		
		for (int i=0; i<numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextDouble();
		}
		
		double higher = numbers[0];
		int position = 0;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] > higher) {
				higher = numbers[i];
				position = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", higher);
		System.out.printf("POSICAO DO MAIOR VALOR = %d", position);
		
		sc.close();

	}

}
