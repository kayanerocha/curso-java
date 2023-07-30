package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aula172 {
	
	// Aula: Bloco finally
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\kayane\\aula172.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Erro opening file: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}

	}

}
