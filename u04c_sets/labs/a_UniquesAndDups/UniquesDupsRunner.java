//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.*;

public class UniquesDupsRunner
{
	public static void main( String args[] )
	{
		String list = "a b c d e f g h a b c d e f g h i j k"; 
		System.out.println("Original List : " + list);
		out.println("Uniques : " + UniquesDupes.getUniques(list));
		out.println("Dupes : " + UniquesDupes.getDupes(list) + "\n\n");
		
      String list2 = "one two three one two three six seven one two"; 
		System.out.println("Original List : " + list2);
		out.println("Uniques : " + UniquesDupes.getUniques(list2));
		out.println("Dupes : " + UniquesDupes.getDupes(list2) + "\n\n");
      
      String list3 = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6"; 
		System.out.println("Original List : " + list3);
		out.println("Uniques : " + UniquesDupes.getUniques(list3));
		out.println("Dupes : " + UniquesDupes.getDupes(list3) + "\n\n");
		//more test cases
		
	}
}