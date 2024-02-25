package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		Map<String, Integer> candidates = new LinkedHashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] data = line.split(",");
				String candidate = data[0];
				int votes = Integer.parseInt(data[1]);
				
				if (candidates.containsKey(candidate)) {
					votes += candidates.get(candidate);
				}
				
				candidates.put(candidate, votes);
				
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e);
		}
		
		for (String key : candidates.keySet()) {
			System.out.println(key + ": " + candidates.get(key));
		}
		
		sc.close();
	}

}
