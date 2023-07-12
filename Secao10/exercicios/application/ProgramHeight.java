package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class ProgramHeight {

	/*
	 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e
	 * mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		double height;		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		People[] people = new People[n];
		
		for (int i=0; i<people.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Idade: ");
			age = sc.nextInt();
			System.out.print("Altura: ");
			height = sc.nextDouble();
			
			people[i] = new People(name, age, height);
		}
		
		double media = 0;
		int contador = 0;
		for (int i=0; i<people.length; i++) {
			media += people[i].getHeight();
			
			if (people[i].getAge() < 16) {
				contador += 1;
			}
		}
		media = media / people.length;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% \n", (double) (contador * 100) / people.length);
		
		for (int i=0; i<people.length; i++) {
			if (people[i].getAge() < 16) {
				System.out.println(people[i].getName());
			}
		}	
		
		sc.close();

	}

}
