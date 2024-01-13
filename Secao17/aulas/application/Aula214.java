package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula214 {

	public static void main(String[] args) {
		
		File file = new File("c:\\Temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			// Enquanto existir linha no arquivo
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
