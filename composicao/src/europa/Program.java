package europa;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's Awesone");
		Post p1 = new Post(
				sdf.parse("01/09/2022 22:00:50"),
				"Traveling to Europe",
				"I'm going to visit this wonderful country!",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}

}
