//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class Lab05a
{
	public static void main ( String[] args )
	{
		//add test cases
      ArrayList<String> list = new ArrayList<String>();
      IteratorTest test = new IteratorTest();
      test.populateListFromString(list, "a b c a b c a");
      test.remove(list, "a");
      out.println(list + "\n");
      
      IteratorTest test1 = new IteratorTest();
      test1.populateListFromString(list, "a b c d e f g h i j x x x x");
      test1.remove(list, "x");
      out.println(list + "\n");
      
      IteratorTest test2 = new IteratorTest();
      test2.populateListFromString(list, "1 2 3 4 5 6 a b c a b c");
      test2.remove(list, "b");
      out.println(list + "\n");

	}
}

