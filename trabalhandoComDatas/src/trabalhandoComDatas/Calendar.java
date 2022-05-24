package trabalhandoComDatas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date; 

public class Calendar {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date data = Date.from(Instant.parse("2022-05-24T07:10:50Z"));
		
		System.out.println(sdf.format(data));		

	}

}
	