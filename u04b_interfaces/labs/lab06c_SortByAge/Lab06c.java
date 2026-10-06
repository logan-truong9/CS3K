//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06c
{
	public static void main ( String[] args ) throws IOException
	{
	   //add test cases
      Scanner file = new Scanner(new File("lab06c.dat"));
      ArrayList<Person> person = new ArrayList<>();
      
      if (file.hasNextInt()) {
			int count = file.nextInt();
			for (int i = 0; i < count && file.hasNext(); i++) {
				person.add(new Person(file.nextInt(), file.nextInt(), file.nextInt(), file.next()));
			}
		}
            
      Collections.sort(person);
      
      for (Person p : person) {
         out.println(p);
      }
	}
}