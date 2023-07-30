package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula171 {
	
	// Aula: Pilha de chamadas de métodos (stack trace)
	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program");

	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			// Se digitar uma letra dispara a exceção InputMismatchException
			int position = sc.nextInt();
			// Se for uma posição que não existe dispara a exceção ArrayIndexOutOfBoundsException
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			// Imprime na tela toda a chamada de métodos que acarretou a exceção
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		sc.close();
		System.out.println("***METHOD2 END***");
	}

}
