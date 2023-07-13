package application;

import java.util.Scanner;

import entities.People;

public class ProgramOlder {

	/*
	 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem ser armazenados em um vetor, e as
	 * idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		People[] people = new People[n];
		
		for (int i=0; i<people.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Idade: ");
			age = sc.nextInt();
			sc.nextLine();
			people[i] = new People(name, age);
		}
		
		int older = people[0].getAge();
		String peopleOlder = people[0].getName();
		for (int i=0; i<people.length; i++) {
			if (people[i].getAge() > older) {
				older = people[i].getAge();
				peopleOlder = people[i].getName();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + peopleOlder);
		
		sc.close();

	}

}
