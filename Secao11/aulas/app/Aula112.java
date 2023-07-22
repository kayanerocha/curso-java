package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aula112 {
	
	// Aula: Convertendo data-hora global para local
	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-07-22");
		LocalDateTime d02 = LocalDateTime.parse("2023-07-22T14:42:26");
		Instant d03 = Instant.parse("2023-07-22T01:42:26Z");
		
		/* Coleção com nomes dos fusos horários customizados
		for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		} */
		
		// LocalDate de Instant (GMT) -> local 
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		System.out.println("LocalDate de Instant (GMT) -> local = " + r1);
		
		// LocalDate de Instant (GMT) -> portugal 
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println("LocalDate de Instant (GMT) -> portugal = " + r2);
		
		// LocalDateTime de Instant (GMT) -> local
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		System.out.println("LocalDateTime de Instant (GMT) -> local = " + r3);
		
		// LocalDateTime de Instant (GMT) -> portugal
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println("LocalDateTime de Instant (GMT) -> portugal = " + r4);
		
		System.out.println("Dia = " + d01.getDayOfMonth());
		System.out.println("Mês = " + d01.getMonthValue());
		System.out.println("Ano = " + d01.getYear());
		System.out.println("Hora = " + d02.getHour());
		System.out.println("Minuto = " + d02.getMinute());
		System.out.println("Segundo = " + d02.getSecond());

	}

}
