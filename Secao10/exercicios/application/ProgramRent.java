package application;

import java.util.Scanner;

import entities.Rent;
import entities.Student;

public class ProgramRent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name, email;
		int room;
		Rent[] rooms = new Rent[10];
		Student student;
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for (int i=0; i<n; i++) {
			System.out.printf("Rent #%d:%n", i+1);
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			sc.nextLine();
			 
			student = new Student(name, email);
			rooms[room] = new Rent(student, room);
			rooms[room].setRoom(room);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.printf("%d: %s, %s%n", i, rooms[i].getStudent().getName(), rooms[i].getStudent().getEmail());
			}			
		}
		
		sc.close();

	}

}
