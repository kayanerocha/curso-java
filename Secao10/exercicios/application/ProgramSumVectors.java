package application;

import java.util.Scanner;

public class ProgramSumVectors {

	/*
	 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde cada elemento de C é a
	 * soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int vectorA[] = new int[n];
		int vectorB[] = new int[n];
		int vectorC[] = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i=0; i<vectorA.length; i++) {
			vectorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i=0; i<vectorB.length; i++) {
			vectorB[i] = sc.nextInt();
		}
		
		for (int i=0; i<vectorA.length; i++) {
			vectorC[i] = vectorA[i] + vectorB[i];
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (int i=0; i<vectorC.length; i++) {
			System.out.println(vectorC[i]);
		}
		
		sc.close();
	}

}
