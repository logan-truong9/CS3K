//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;




public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
      map = new TreeMap<String,Set<String>>();


	}

	public void setPersonRelative(String line)
	{
      String[] personRelative = line.split(" ");
      
      if (!map.containsKey(personRelative[0])) {
         map.put(personRelative[0], new TreeSet<String>());
      }
      if (personRelative.length == 2) {
         map.get(personRelative[0]).add(personRelative[1]);
      }
   
   }

	public Set<String> getRelatives(String person)
	{
      
      return map.get(person);
	}


	public String toString()
	{
		String output="";

      






		return output;
	}
}