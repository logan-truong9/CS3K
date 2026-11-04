//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
      setSentence("");
	}

	public Histogram(String sent)
	{
      setSentence(sent);
      
	}
	
	public void setSentence(String sent)
	{
      histogram = new TreeMap<String,Integer>();
      for (char c : sent.toCharArray()) {
         if (!histogram.containsKey(String.valueOf(c))){
            histogram.put(String.valueOf(c),1);
         }
         else {
            histogram.put(String.valueOf(c), histogram.get(String.valueOf(c))+1);
         }
      }

	}

	public String toString()
	{
		String output = "char" + "\t" + "123456789012345" + "\n";
      for (String k : histogram.keySet()) {
         output += k + "\t" + "\t";
         for (int i = 0; i < histogram.get(k); ++i) {
            output += "*";
         }
         output += "\n";
      }
      return output;
	}
}

