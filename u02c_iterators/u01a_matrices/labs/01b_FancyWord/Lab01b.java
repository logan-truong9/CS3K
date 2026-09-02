//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab01b
{
	public static void main( String args[] ) throws IOException
	{
		//add code and test cases here
      Scanner file = new Scanner(new File("Lab01b.dat"));
      while (file.hasNext()) {
         String word = file.next();
         FancyWord fancy = new FancyWord(word);
         out.print(fancy + "\n");
      }
	}
}

