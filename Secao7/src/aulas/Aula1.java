package aulas;

import java.util.Scanner;

public class Aula1 {
	
	// Aula: operadores bitwise
	public static void main(String[] args) {
		
		/*
		 * Realizam operações lógicas bit a bit em valores
		 * & -> operação "E" bit a bit
		 * | -> operação "OU" bit a bit
		 * ^ -> operação "OU-exclusivo" bit a bit
		 */
		
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b00100000; // ou 32 que tem apenas o sexto bit valendo 1
		int n = sc.nextInt();
		
		// Testando se o sexto bit de n vale 1 ou 0
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();

	}

}
