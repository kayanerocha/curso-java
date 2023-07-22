package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula111 {
	
	// Aula: Conveetendo data-hora para texto
	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-07-22");
		LocalDateTime d02 = LocalDateTime.parse("2023-07-22T14:42:26");
		Instant d03 = Instant.parse("2023-07-22T01:42:26Z");
		
		// Ref: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		// LocalDate -> Customizado
		System.out.println("LocalDate -> Customizado = " + d01.format(fmt1));
		System.out.println("LocalDate -> Customizado = " + fmt1.format(d01));
		
		// LocalDateTime -> Customizado
		System.out.println("LocalDateTime -> Customizado = " + d02.format(fmt1));
		System.out.println("LocalDateTime -> Customizado = " + d02.format(fmt2));
		
		// Instant (GMT) -> Customizado local
		System.out.println("Instant (GMT) -> Customizado local = " + fmt3.format(d03));
		
		// LocalDateTime -> ISO_DATE_TIME
		System.out.println("LocalDateTime -> ISO_DATE_TIME = " + d02.format(fmt4));
		
		// Instant (GMT) -> ISO_INSTANT
		System.out.println("Instant (GMT) -> ISO_INSTANT = " + fmt5.format(d03));
		
		// Instant -> ISO
		System.out.println("Instant -> ISO = " + d03.toString());
	}

}
