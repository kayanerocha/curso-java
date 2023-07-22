package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Aula115 {
	
	// Aula: Trabalhando com datas - Date
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		// Data com horário atual
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		// Data e hora passando os milisegundos
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5);
		
		System.out.println("Date sem hora = " + y1);
		System.out.println("Date com hora = " + y2);
		System.out.println("Data e hora atual = " + x1);
		System.out.println("Data e hora atual = " + x2);
		System.out.println("Data e hora com milisegundos = " + x3);
		System.out.println("Data e hora com milisegundos = " + x4);
		System.out.println("Data e hora com Instant (GMT) = " + y3);
		
		System.out.println("--------------------------------------------");
		System.out.println("Data customizada = " + sdf2.format(y1));
		System.out.println("Data e hora customizada = " + sdf2.format(y2));
		System.out.println("Data e hora atual = " + sdf2.format(x1));
		System.out.println("Data e hora atual = " + sdf2.format(x2));
		System.out.println("Data e hora com milisegundos = " + sdf2.format(x3));
		System.out.println("Data e hora com milisegundos = " + sdf2.format(x4));
		System.out.println("Data e hora com Instant (GMT) = " + sdf2.format(y3));
		
		System.out.println("--------------- GMT --------------");
		System.out.println("Data customizada = " + sdf3.format(y1));
		System.out.println("Data e hora customizada = " + sdf3.format(y2));
		System.out.println("Data e hora atual = " + sdf3.format(x1));
		System.out.println("Data e hora atual = " + sdf3.format(x2));
		System.out.println("Data e hora com milisegundos = " + sdf3.format(x3));
		System.out.println("Data e hora com milisegundos = " + sdf3.format(x4));
		System.out.println("Data e hora com Instant (GMT) = " + sdf3.format(y3));
	}

}
