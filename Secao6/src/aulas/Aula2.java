package aulas;

import java.util.Scanner;

public class Aula2 {
	
	// Aula: Estrutura while
	public static void main(String[] args) {
		/*
		 * Repete um bloco de comandos enquanto uma condição for verdadeira.
		 * Usar: quando não souber a quantidade de repetições.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		int soma = 0;
		while (numero != 0) {
			soma += numero;
			numero = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
