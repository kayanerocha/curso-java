package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula216 {

	public static void main(String[] args) {
		
		/*
		 * Bloco try-with-resources
		 * É um bloco try que declara um ou mais recursos, e garante que esses recursos serão fechados ao final do bloco
		 */
		
		String path = "c:\\Temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line= br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
