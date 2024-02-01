package instanciacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class exemplosInstanciacao {

	public static void main(String[] args) {
		
		//instanciando LocalDate e LocalDate Time
		LocalDate d01 = LocalDate.now(); //instanciando a data
		System.out.println(d01);
		
		LocalDateTime d02 = LocalDateTime.now(); //instanciando data e hora
		System.out.println(d02);
		
		Instant d03 = Instant.now();
		System.out.println(d03); //instanciando o instant, lembrando q é global Ztime
		
		//conveter texto ISO8601 e gerar data-hora
		LocalDate d04 = LocalDate.parse("2022-07-20"); //parse é um método estático
		System.out.println(d04);
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println(d05);
		Instant d06 = Instant.parse("2022-07-20T01:30:26z");
		System.out.println(d06);
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		System.out.println(d07);
		//no java o objeto LocalDate interpreta que este deve ser convertido para toString para print
		
		//texto no formato customizado para data-hora
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println(d08);
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		System.out.println(d09);
		
		//dados isolados para data-hora-local
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		System.out.println(d10);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		System.out.println(d11);
	}

}
