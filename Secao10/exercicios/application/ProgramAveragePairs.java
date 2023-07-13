package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAveragePairs {
	
	/*
	 * Fazer um programa para ler um vetor de N npumeros inteiros. Em seguida, mostrar na tela a média aritméticas somente dos números pares lidos,
	 * com uma casa decimal. Se nenhum número par for digitado, mostrar a mensagem "NENHUM NÚMERO PARA".
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int numbers[] = new int[n];
		
		for (int i=0; i<numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
		}
		
		double avg = 0;
		int cont = 0;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				avg += (double) numbers[i];
				cont += 1;
			}
		}
		avg = avg / cont;
		
		if (avg > 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", avg);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();

	}

}
