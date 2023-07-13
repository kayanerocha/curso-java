package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class ProgramPeople {
	
	/*
	 * Tem-se um conjunto de dados contendo a altura e  o gênero (M, F) de N pessoas. Fazer um programa que calcule e escreva a maior e a menor
	 * altura do grupo, a média de altura das mulheres, e o número de homens.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double height;
		char gender;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		People[] people = new People[n];
		
		for (int i=0; i<people.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			height = sc.nextDouble();
			System.out.printf("Gênero da %da pessoa: ", i+1);
			gender = sc.next().charAt(0);
			people[i] = new People(height, gender);
		}
		
		double smaller = people[0].getHeight();
		double bigger = people[0].getHeight();
		double avg = 0;
		int men = 0;
		for (int i=0; i<people.length; i++) {
			if (people[i].getHeight() < smaller) {
				smaller = people[i].getHeight();
			}
			
			if (people[i].getHeight() > bigger) {
				bigger = people[i].getHeight();
			}
			
			if (people[i].getGender() == 'F') {
				avg += people[i].getHeight();
			} else {
				men += 1; 
			}
		}
		avg = avg / (people.length - men);
		
		System.out.printf("Menor altura: %.2f%n", smaller);
		System.out.printf("Maior altura: %.2f%n", bigger);
		System.out.printf("Média das alturas das mulheres = %.2f%n", avg);
		System.out.printf("Números de homens = %d", men);
		
		sc.close();

	}

}
