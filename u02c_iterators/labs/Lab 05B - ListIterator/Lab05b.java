//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class Lab05b
{
	public static void main ( String[] args )
	{
		//add test cases	
      ListIteratorTest test = new ListIteratorTest("a b c a b c");
      test.replace("a", "+");
      out.println(test + "\n");
      
      ListIteratorTest test1 = new ListIteratorTest("a b c d e f g h i j x x x x");
      test1.replace("x", "7");
      out.println(test1 + "\n");
      
      ListIteratorTest test2 = new ListIteratorTest("1 2 3 4 5 6 a b c a b c");
      test2.replace("b", "#");
      out.println(test2 + "\n");
	}
}
