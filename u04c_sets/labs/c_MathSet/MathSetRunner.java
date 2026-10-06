//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		//add test cases
      Scanner file = new Scanner(new File("lab_c.dat"));
      
      while (file.hasNextLine()) {
         String line1 = file.nextLine();
         if (line1.isEmpty()) {
            continue;
         }
         if (file.hasNextLine()) {
            String line2 = file.nextLine();
            MathSet ms = new MathSet(line1, line2);
            out.println(ms);
         }
      }
	}
}
