package aulas;

import java.util.Scanner;

public class Aula3 {
	
	// Aula: Estrutura repetitiva for
	public static void main(String[] args) {
		/*
		 * Repete um bloco de comandos para um certo intervalo de valores.
		 * Usar: quando sabe a quantidade de repetições ou o intervalo de valores.]
		 * Repetição baseada em uma contagem.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			soma += sc.nextInt(); 
		}
		
		System.out.println(soma);

	}

}
