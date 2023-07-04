package aulas;

import java.util.Scanner;

public class Aula2 {
	
	// Aula: Entrada de dados
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Ler texto
		System.out.println("Lendo um texto: ");
		String texto;
		texto = sc.next();
		System.out.println("Você digitou: " + texto);
		
		// Ler inteiro
		System.out.println("Lendo um inteiro: ");
		int inteiro;
		inteiro = sc.nextInt();
		System.out.println("Inteiro: " + inteiro);
		
		/*
		 * Ler double
		 * Para considerar o separador de decimais como é necessário configurar o Locale como US
		 * println utiliza o padrão do US enquanto que o printf não
		 */
		System.out.println("Lendo um double: ");
		double pontoFlutuante;
		pontoFlutuante = sc.nextDouble();
		System.out.println("Double: " + pontoFlutuante);
		
		// Ler caractere
		System.out.println("Lendo um caractere: ");
		char caractere;
		caractere = sc.next().charAt(0);
		System.out.println("Char: " + caractere);
		
		// Ler vários dados na mesma linha
		System.out.println("Lendo vários dados em uma linha");
		String primeiro;
		int segundo;
		double terceiro;
		primeiro = sc.next();
		segundo = sc.nextInt();
		terceiro = sc.nextDouble();
		System.out.println(primeiro);
		System.out.println(segundo);
		System.out.println(terceiro);
		
		sc.close();

	}

}
