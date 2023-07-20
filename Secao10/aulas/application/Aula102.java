package application;

import java.util.Scanner;

public class Aula102 {
	
	/*
	 * Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo
	 * números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores
	 * negativos da matriz.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// Arranjo bidimensional
		int[][] mat = new int[n][n];
		
		// Percorrendo a matriz
		for (int i=0; i<mat.length; i++) {
			// mat[i].length -> quantidade de colunas
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int count = 0;
		System.out.println("Main diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
			
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count += 1;
				}
			}			
		}
		System.out.println();
		System.out.println("Negative numbers = " + count);
		
		sc.close();

	}

}
