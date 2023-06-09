package aulas;

import java.util.Locale;

public class Aula4 {
	
	// Aula: Saída de dados
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Bom dia!");
		
		int idade = 25;
		double x = 10.35784;
		char sexo = 'F';
		System.out.println("Idade: " + idade);
		System.out.println("X = " + x);
		
		/*
		 * %n ou \n -> quebra de linha
		 * printf() pega o padrão decimal que está configurado no computador
		 * %.2f deixa duas casas decimais
		 */
		System.out.printf("Valor com duas casas decimais padrão BR: %.2f%n", x);
		
		// Altera o padrão de casa decimal para o US
		Locale.setDefault(Locale.US);
		System.out.printf("Valor com o padrão do US: %.4f%n", x);
		
		System.out.println("Idade: " + idade + " anos");
		System.out.printf("Resultado = %.2f metros%n", x);
		
		/*
		 * Formatação de string:
		 * - %f = ponto flutuante
		 * - %d = inteiro
		 * - %s = texto
		 * - %n ou \n = quebra de linha
		 */
		String nome = "Maria";
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		float b;
		b = 6f;
		System.out.printf("b = %f", b);
		

	}

}
