package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {
	
	/*
	 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do
	 * ano. Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS)
	 * ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser
	 * aprovado (que é 60% da nota).
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();

	}

}
