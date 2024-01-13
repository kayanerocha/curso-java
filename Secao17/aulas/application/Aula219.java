package application;

import java.io.File;
import java.util.Scanner;

public class Aula219 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Nome do arquivo
		System.out.println("getName: " + path.getName());
		// Caminho do arquivo
		System.out.println("getParent: " + path.getParent());
		// Caminho e nome do arquivo
		System.out.println("getPath: " + path.getPath());
		
		sc.close();

	}

}
