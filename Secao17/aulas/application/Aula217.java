package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula217 {

	public static void main(String[] args) {
		
		/*
		 * FileWriter: stream de escrita de caracteres em arquivos
		 * - new FileWriter(path): cria/recria o arquivo
		 * - new FileWriter(path, true): acrescenta no arquivo existente
		 * BufferedWriter: mais rápido
		 */
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
