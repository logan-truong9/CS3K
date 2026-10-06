//Copyright A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddsEvensRunner
{
	public static void main( String args[] ) throws IOException
	{
		//more test cases
		Scanner file = new Scanner(new File("labB.dat"));
      
      while (file.hasNextLine()) {
         String line = file.nextLine();
         if (!line.isEmpty()) {
            OddEvenSets test = new OddEvenSets(line);
            out.println(test);
         }
      }
	}
}