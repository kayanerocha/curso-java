package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer7 {
	
	/*
	 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
	 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int primeiro, segundo;
		double divisao;
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			primeiro = sc.nextInt();
			segundo = sc.nextInt();
			if (segundo == 0) {
				System.out.println("divisao impossivel");
			} else {
				divisao = (double) primeiro / segundo;
				System.out.printf("%.1f\n", divisao);
			}
		}
		
		sc.close();

	}

}
