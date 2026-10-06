//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class VowelWord implements Comparable<VowelWord>
{
	//add a string instance variable
   String str;
	
	//add a constructor
   public VowelWord (String s) {
      str = s;
   }

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
      for (int i = 0; i < str.length(); ++i) {
         if (vowels.contains(str.substring(i, i + 1))) {
            ++vowelCount;
         }
      }
		return vowelCount;
	}

	public int compareTo(VowelWord other)
	{
		if (this.numVowels() > other.numVowels()) {
         return 1;
      }
      if (this.numVowels() < other.numVowels()) {
         return -1;
      }
      return this.str.compareTo(other.str);
	}

	public String toString()
	{
		return str;
	}
}