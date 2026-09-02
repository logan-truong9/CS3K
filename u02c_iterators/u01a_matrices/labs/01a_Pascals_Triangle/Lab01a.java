//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab01a
{
	public static void main( String args[] ) throws IOException
	{
		//add code and test cases here
      PascalsTriangle pascal = new PascalsTriangle(6); 
      out.print(pascal);
      
      Scanner file = new Scanner(new File("lab01a.dat"));
      while (file.hasNextInt()) {
         int size = file.nextInt();
         PascalsTriangle pascal1 = new PascalsTriangle(size); 
         out.print(pascal1);
      }

      
	}
}

