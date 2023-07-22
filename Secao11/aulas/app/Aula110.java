package app;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aula110 {
	
	// Aula: Instanciando data-hora
	public static void main(String[] args) {
		
		// Data atual local
		LocalDate d01 = LocalDate.now();
		// Concatenar = chamar o toString() do objeto, então objeto -> String chama o toString()
		System.out.println("Data atual local = " + d01);
		
		// Data-hora atual local
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Data-hora atual local = " + d02);
		
		// Data-hora atual GMT
		Instant d03 = Instant.now();
		System.out.println("Data-hora atual GMT = " + d03);
		
		// Formato ISO para objeto LocalDate
		LocalDate d04 = LocalDate.parse("2023-07-22");
		System.out.println("ISO -> LocalDate = " + d04);
		
		// Formato ISO para objeto LocalDateTime
		LocalDateTime d05 = LocalDateTime.parse("2023-07-22T14:13:05");
		System.out.println("ISO -> LocalDateTime = " + d05);
		
		// Formato ISO para objeto Instant (GMT)
		Instant d06 = Instant.parse("2023-07-22T14:13:05Z");
		System.out.println("ISO GMT -> Instant (GMT) = " + d06);
		
		// Formato ISO local para objeto Instant (GMT)
		Instant d07 = Instant.parse("2023-07-22T14:13:05-03:00");
		System.out.println("ISO local -> Instant (GMT) = " + d07);
		
		/*
		 *  Formato customizado
		 *  DateTimeFormatter -> formata de String para Data-hora
		 *  Ref: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		 */
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("22/07/2023", fmt1);
		System.out.println("Data customizada -> LocalDate = " + d08);
		
		// Data-hora customizada para ISO
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("22/07/2023 14:35", fmt2);
		System.out.println("Data-hora customizada -> LocalDateTime = " + d09);
		
		// Dados soltos para LocalDate
		LocalDate d10 = LocalDate.of(2023, 7, 22);
		System.out.println("Dados soltos -> LocalDate = " + d10);
		
		// Dados soltos para LocalDateTime
		LocalDateTime d11 = LocalDateTime.of(2023, 07, 22, 14, 39);
		System.out.println("Dados soltos -> LocalDateTime = " + d11);
	}

}
