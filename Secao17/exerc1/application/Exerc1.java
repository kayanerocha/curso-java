package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exerc1 {
	
	/*
	 * Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos. Cada item possui um nome, preço unitário e
	 * quantidade, separados por vírgula. Você deve gerar um novo arquivo chamado "summary.csv", localizado em uma subpasta chamada "out" a partir
	 * da pasta original do arquivo de origem, contendo apenas o nome e o valor total para aquele item (preço unitário multiplicado pela quantidade),
	 * conforme exemplo.
	 */
	
	public static String getTotal(String line) {
		ArrayList<String> produto = new ArrayList<>();
		String listProduto[] = line.split(",");
		String nome = listProduto[0];
		double preco = Double.parseDouble(listProduto[1]);
		int quantidade = Integer.parseInt(listProduto[2]);
		double total = preco * quantidade;
		
		return nome + "," + String.format("%.2f", total).replace(",", ".");
	}
	
	public static void writeFile(String produto) {
		String strPathOutput = "c:\\Temp\\";
		new File(strPathOutput + "\\out").mkdir();
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(strPathOutput+"\\out\\summary.csv", true))) {
			bw.write(produto);
			bw.newLine();
		}
		catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Caminho: ");
		String strPath = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			String line = br.readLine();
			while (line != null) {
				String produto = getTotal(line);		
				line = br.readLine();
				
				writeFile(produto);
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
