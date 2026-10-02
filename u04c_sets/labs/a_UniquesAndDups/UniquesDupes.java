//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();

		//add code
      
      String[] list = input.split(" ");
      for (String word : list) {
         if (!uniques.contains(word)) {
            uniques.add(word);
         }
      }
		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		//add code
      Set<String> uniques = new TreeSet<String>();
      Set<String> dupes = new TreeSet<String>();
      
      String[] list = input.split(" ");
      for (String word: list) {
         if (!uniques.add(word)) {
            dupes.add(word);
         }
      }
            
		
		return dupes;
	}
}