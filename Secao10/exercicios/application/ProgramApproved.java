package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramApproved {
	
	/*
	 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas
	 * informações deve ser armazenada emum vetor. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das
	 * notas seja maior ou igual a 6.0 (seis).
	 */

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double note1, note2;
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Student[] students = new Student[n];
		
		for (int i=0; i<students.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i+1);
			name = sc.nextLine();
			note1 = sc.nextDouble();
			note2 = sc.nextDouble();
			sc.nextLine();
			students[i] = new Student(name, note1, note2);
		}
		
		System.out.println("Alunos aprovados: ");
		double avg;
		for (int i=0; i<students.length; i++) {
			avg = (double) (students[i].getNote1() + students[i].getNote2()) / 2;
			if (avg >= 6.0) {
				System.out.println(students[i].getName());
			}
		}
		
		sc.close();

	}

}
