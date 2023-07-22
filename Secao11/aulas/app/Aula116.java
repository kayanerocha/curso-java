package app;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Aula116 {
	
	// Aula: Manipulando um Date com Calendar
	public static void main(String[] args) {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		// Somando uma unidade de tempo
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		// Obtendo uma unidade de tempo
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Mais 4 horas = " + sdf.format(d));
		System.out.println("minutes = " + minutes);
		System.out.println("month = " + month);
	}

}
