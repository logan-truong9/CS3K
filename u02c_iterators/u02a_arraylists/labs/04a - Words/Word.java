//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
      word = "";
	}

	public Word(String wrd)
	{
      word = wrd;
	}

	public void setWord(String wrd)
	{
      word = wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;
      
      for (int i = 0; i < word.length(); ++i) {
         for (int j = 0; j < vowels.length(); ++j) {
            if (word.substring(i, i + 1).equals(vowels.substring(j, j + 1))) {
               ++count;
            }
         }
      }

		return count;
	}
	
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   //return word + "\n" + "num vowels == " + getNumVowels() + "\n" + "num chars == " + getLength()
      return word;
	}
}
