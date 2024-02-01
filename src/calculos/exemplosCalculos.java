package calculos;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class exemplosCalculos {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); 
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26z");
		
		//SUBTRACAO e ADICAO de dia
		LocalDate pastWeekLocalDate = d04.minusDays(7);//Uma semana antes
		System.out.println(pastWeekLocalDate);
		
		LocalDate nextWeekLocalDate = d04.plusDays(7);//uma semana depois
		System.out.println(nextWeekLocalDate);
		
		LocalDate nextYearLocalDate = d04.plusYears(1);
		System.out.println(nextYearLocalDate);
		
		//com hora
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);//Uma semana antes
		System.out.println("-7: " + pastWeekLocalDateTime);
		
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);//uma semana depois
		System.out.println("-7: " + nextWeekLocalDateTime);
		
		LocalDateTime nextYearLocalDateTime = d05.plusYears(1);
		System.out.println(nextYearLocalDateTime);
		
		//calculos de hora
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		System.out.println(pastWeekInstant);
		
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println(nextWeekInstant);
		
		//duracao de data-hora
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0,0)); //para local-date precisa definir o horário
		System.out.println("T1 dias: " + t1.toDays());
		
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("T1 dias: " + t2.toDays());
		
		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("T3 dias: " + t3.toDays());
	}

}
