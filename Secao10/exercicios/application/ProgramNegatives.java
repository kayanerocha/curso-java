package application;

import java.util.Scanner;

public class ProgramNegatives {
	
	/*
	 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um vetor.
	 * Em seguida, mostrar na tela todos os números negativos lidos.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int numbers[] = new int[n];
		
		for (int i=0; i<numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}
		
		sc.close();
	}

}
