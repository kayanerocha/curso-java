package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula170 {
	
	// Aula: Estrutura try-catch
	public static void main(String[] args) {
		
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
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		System.out.println("End of program");
		
		sc.close();

	}

}
