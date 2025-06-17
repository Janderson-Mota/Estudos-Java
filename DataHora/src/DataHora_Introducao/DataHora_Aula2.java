package DataHora_Introducao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class DataHora_Aula2 {

	public static void main(String[] args) {
		
		//Criação de objetos tipo tempo
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T13:34:23");
		Instant d06 = Instant.parse("2022-07-20T13:34:23Z");

		//Criação de formatação 
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		
		//Padrões para chamar o metodo 
		System.out.println("d04: "+ d04.format(fmt1));
		System.out.println("d04: "+ fmt1.format(d04));
		System.out.println("d04: "+ d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("\nd05: "+ d05.format(fmt1));
		System.out.println("d05: "+ d05.format(fmt2));
		
		//Padrões de formatação da classe instant
		System.out.println("\nd06: "+ d06); 
		System.out.println("d06: "+ fmt3.format(d06));
		
		
		
		
	}

}
