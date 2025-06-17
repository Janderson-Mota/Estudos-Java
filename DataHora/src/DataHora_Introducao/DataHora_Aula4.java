package DataHora_Introducao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora_Aula4 {

	public static void main(String[] args) {
		
		//Instanciando 
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDate pastWeekLocal = d04.minusDays(7);
		LocalDate nextWeekLocal = d04.plusDays(7);
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T13:34:23");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		//Criação de formatação 
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println(pastWeekLocal);
		System.out.println(nextWeekLocal);
		
		
		
	}

}
