package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataeHora {
	
	public static void main(String[] args) {
		
		// exibir apenas a data
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate: " + localDate);
		
		// exibir apenas a hora
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime: " + localTime);
		
		//exibir a data e a hora
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime: " + localDateTime);
		
		System.out.println("Dia: " + localDateTime.getDayOfMonth());
		System.out.println("Mês: " + localDateTime.getMonth());
		System.out.println("Ano: " + localDateTime.getYear());
		System.out.println("Hora: " + localDateTime.getHour());
		System.out.println("Minuto: " + localDateTime.getMinute());
		System.out.println("Segundos: " + localDateTime.getSecond());
		
		
	}
}
