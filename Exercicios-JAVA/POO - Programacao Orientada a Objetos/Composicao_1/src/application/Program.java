package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Coments;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Coments c1 = new Coments("Have a nice trip");
		Coments c2 = new Coments("Wow that's awesome");
		
		Post p1 = new Post(sdf.parse("21/06/2022 13:05:44"), 
				"Traveling to New Zeland", 
				"I'm going to visit this wonderful country!", 
				12);
	
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		// -------- SEGUNDO POST --------
		c1 = new Coments("Goog night");
		c2 = new Coments("May the Force be with you");
		
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), 
				"Good night guys",
				"See you tomorrow",
				5);
		
		p2.addComment(c1);
		p2.addComment(c2);		
		
		System.out.println(p2.toString());
	}

}
