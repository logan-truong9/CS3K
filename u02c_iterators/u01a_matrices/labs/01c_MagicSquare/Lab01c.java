//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab01c
{
	public static void main( String args[] ) throws IOException
	{
		//add code and test cases here

      
      
      Scanner file = new Scanner(new File("Lab01c.dat"));
      while (file.hasNextInt()) {
         int size = file.nextInt();
         MagicSquare square = new MagicSquare(size);
         out.print(square + "\n");
      }
	}
}

