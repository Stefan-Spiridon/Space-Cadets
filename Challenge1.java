import java.util.Scanner;
import java.net.*;
import java.io.*;


public class aaa {
	
	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("id:");
		String id = input.next();
		String link = "https://www.ecs.soton.ac.uk/people/"+ id;
	    
	    URL url = new URL(link);
	    
	    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

	    String line;
	  
	    for (int i = 0; i < 8; i++)
	    {
	      line=reader.readLine();
	      if (i==7) System.out.print(line.substring(line.indexOf(">") + 1, line.indexOf("|")));
	    }
	    
	    reader.close();
		
	}
}
