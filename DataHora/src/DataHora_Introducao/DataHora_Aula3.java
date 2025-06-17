package DataHora_Introducao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora_Aula3 {

	public static void main(String[] args) {
		
		//Instanciando 
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T13:34:23");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		//Criação de formatação 
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

		
		//Parametro de busca extendido 
		ZoneId.getAvailableZoneIds();
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("R1 : "+ r1);
		System.out.println("R2 : "+ r2);
		System.out.println("R3 : "+ r3); 
		System.out.println("R3 : "+ r4);
		
		// Busca simplificada de infomações expecificas
		System.out.println("\ndo4 dia: "+ d04.getDayOfMonth());
		System.out.println("do4 mês: "+ d04.getMonthValue());
		System.out.println("do4 ano: "+ d04.getYear());
		System.out.println("do4 dia do ano: "+ d04.getDayOfYear());
		
		
	}

}
