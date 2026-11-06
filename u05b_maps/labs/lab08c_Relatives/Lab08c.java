//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab08c
{
	public static void main( String args[] ) throws IOException
	{
		//add more test cases
      Relatives fam = new Relatives();		

      
      Scanner scan = new Scanner(new File("lab08c.dat"));

      if (scan.hasNextInt()) {
         int size = scan.nextInt();
      }
      
      while (scan.hasNextLine()) {
         fam.setPersonRelative(scan.nextLine());
      }
      
      out.println(fam);
	}
}