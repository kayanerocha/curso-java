package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula4 {
	
	// Aula: Estrutura repetitiva do-while
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double temperatura;
		char opcao;
		
		// O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			temperatura = sc.nextDouble();
			
			System.out.printf("Equivalene em Fahrenheit: %.1f\n", (9 * temperatura) / 5 + 32);
			
			System.out.print("Deseja repetir (s/n)? ");
			opcao = sc.next().charAt(0);
			
		} while (opcao == 's');
		
		sc.close();

	}

}
