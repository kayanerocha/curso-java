package application;

import java.io.File;
import java.util.Scanner;

public class Aula218 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Filtra todos os diretórios e guarda em um vetor
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Filtra todos os arquivos e guarda em um vetor
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		// Cria uma subpasta
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);		
		
		sc.close();

	}

}
