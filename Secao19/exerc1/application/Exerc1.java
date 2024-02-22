package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Log;
import entities.People;

public class Exerc1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<Log> logs = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(" ");
				String user = fields[0];
				Date instant = Date.from(Instant.parse(fields[1]));
				Log log = new Log(new People(user), instant);
				
				logs.add(log);
				
				line = br.readLine();
			}
			System.out.println("Total users: " + logs.size());
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
		
	}

}
