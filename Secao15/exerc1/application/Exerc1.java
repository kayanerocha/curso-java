package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.WithdrawException;

public class Exerc1 {

	/*
	 *  Exercício: Criando exceções personalizadas
	 *  throws ParseException -> indica que o método pode lançar uma exceção desse tipo e não precisa tratar, se acontecer ela vai ser propagada
	 *  nesse método
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.nextLine());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.nextLine());
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation.toString());
	
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.nextLine());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.nextLine());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.print("Reservation: " + reservation.toString());
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (WithdrawException e) { // Captura a exceção caso seja lançada
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) { // Qualquer exceção que possa ocorrer é uma RuntimeException usando upcasting
			System.out.println("Unexpected error");
		}
		
		sc.close();

	}

}
