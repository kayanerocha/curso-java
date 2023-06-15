package exercicios;

import java.util.Scanner;

public class Exer4 {
	
	/*
	 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
	 * X, se for o caso.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int resto;
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			resto = i % 2;
			if (resto != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
