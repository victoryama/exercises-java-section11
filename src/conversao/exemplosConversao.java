package conversao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class exemplosConversao {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); 
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26z");

		//DATA-HORA para TEXTO
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //converte no formato data-hora para texto
		System.out.println(d04.format(fmt1)); 
		System.out.println(fmt1.format(d04)); //formas similares
		System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //só instancia no momento
		
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
		System.out.println(d05.format(fmt2));
		
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/YYY HH:mm").withZone(ZoneId.systemDefault());//para o instant tem-se necessário definir o fuso horário
		System.out.println(fmt3.format(d06)); //data equivalente no respectivo fuso horário
		//não pode formator o Instant sem informnar o fuso horário 
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; //usando outro formato padrão ISO (data local)
		System.out.println(d05.format(fmt4));

		//DATA-HORA Global para Local
		//precisa informar o timezone
		
		//for (String s : ZoneId.getAvailableZoneIds()) {
		//	System.out.println(s);
		//}
		
		LocalDateTime r1 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		System.out.println(r1);
		
		LocalDateTime r2 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println(r2);
		
		//Obter data-hora local
		System.out.println(d04.getDayOfMonth());
		System.out.println(d04.getMonthValue());
		System.out.println(d04.getYear());
		
		System.out.println(d05.getHour()); //para LocalDateTime
		System.out.println(d05.getMinute());
		
		
		
		}
	
		
}
