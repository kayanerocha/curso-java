package application;

import java.util.Scanner;

public class ProgramPairNumbers {

	/*
	 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os números pares, e também a
	 * quantidade de números pares.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int numbers[] = new int[n];
		
		for (int i=0; i<numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NÚMEROS PARES:");
		int cont = 0;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + " ");
				cont += 1;
			}			
		}
		
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d", cont);
		
		sc.close();

	}

}
