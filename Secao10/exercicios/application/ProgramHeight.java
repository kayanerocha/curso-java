package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHeight {

	/*
	 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e
	 * mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String names[] = new String[n];
		int ages[] = new int[n];
		double heights[] = new double[n];
		
		for (int i=0; i<names.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			names[i] = sc.nextLine();
			System.out.print("Idade: ");
			ages[i] = sc.nextInt();
			System.out.print("Altura: ");
			heights[i] = sc.nextDouble();
		}
		
		double media = 0;
		int contador = 0;
		for (int i=0; i<names.length; i++) {
			media += heights[i];
			
			if (ages[i] < 16) {
				contador += 1;
			}
		}
		media = media / ages.length;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% \n", (double) (contador * 100) / names.length);
		
		for (int i=0; i<names.length; i++) {
			if (ages[i] < 16) {
				System.out.println(names[i]);
			}
		}	
		
		sc.close();

	}

}
