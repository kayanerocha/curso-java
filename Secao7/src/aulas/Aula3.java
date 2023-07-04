package aulas;

import java.util.Scanner;

public class Aula3 {
	
	// Aula: funções (sintaxe)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		
		
		sc.close();

	}
	
	/*
	 * static: possa ser chamada sem precisar criar um objeto
	 * retorna o maior número
	 */
	public static int max(int x, int y, int z) {
		int higher;
		if (x > y && x > z) {
			higher = x;
		} else if (y > z) {
			higher = y;
		} else {
			higher = z;
		}
		
		return higher;
	}
	
	public static void showResult(int result) {
		System.out.println("Higher = " + result);
	}

}
