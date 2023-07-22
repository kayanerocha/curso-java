package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aula113 {
	
	// Aula: Cálculos com data-hora
	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-07-22");
		LocalDateTime d02 = LocalDateTime.parse("2023-07-22T14:42:26");
		Instant d03 = Instant.parse("2023-07-22T01:42:26Z");
		
		// Diminuindo uma semana
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		System.out.println("Past week = " + pastWeekLocalDate);
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		System.out.println("Past week = " + pastWeekLocalDateTime);
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		System.out.println("Past week = " + pastWeekInstant);
		
		// Aumentando uma semana
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		System.out.println("Next week = " + nextWeekLocalDate);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		System.out.println("Next week = " + nextWeekLocalDateTime);		
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		System.out.println("Next week = " + nextWeekInstant);
		
		// Duração
		Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
		System.out.println("Duração em dias LocalDateTime = " + t1.toDays());
		
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atTime(0, 0));
		System.out.println("Duração em dias LocalDate = " + t2.toDays());
		Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		System.out.println("Duração em dias LocalDate = " + t3.toDays());
		
		Duration t4 = Duration.between(pastWeekInstant, d03);
		System.out.println("Duração em dias Instant = " + t4.toDays());
		
		Duration t5 = Duration.between(d03, pastWeekInstant);
		System.out.println("Duração em dias Instant = " + t5.toDays());
		
	}

}
