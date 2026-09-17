//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab09c
{
	public static void main( String args[] ) throws IOException
	{
      String[] vals = {"A", "E", "I", "O", "U"};
      Grid test = new Grid(6, 6, vals);
      out.println(test);
      out.println("\n A count == " +test.findMax("A"));
      out.println("\n E count == " +test.findMax("E"));
      out.println("\n I count == " +test.findMax("I"));
	}
}