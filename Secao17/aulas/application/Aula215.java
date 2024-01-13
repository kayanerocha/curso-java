package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula215 {

	public static void main(String[] args) {
		/*
		 * FileReader: stream de leitura de caracteres a partir de arquivos
		 * BufferedReader: instanciado a partir do FileReader, a litura fica mais rápida
		 */
		
		String path = "c:\\Temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line= br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
