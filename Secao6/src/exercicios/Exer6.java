package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer6 {
	
	/*
	 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
	 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
	 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
	 * peso 5.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor1, valor2, valor3, media;
		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			
			media = (valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0) / 10;
			System.out.printf("%.1f\n", media);
		}
		
		sc.close();

	}

}
