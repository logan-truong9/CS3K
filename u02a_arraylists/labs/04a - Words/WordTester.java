//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordTester
{
	public static void main(String[] args)
	{
		//add test cases
		Word test = new Word("chicken");
      out.println(test);
      out.println("num vowels == " + test.getNumVowels());
      out.println("num chars == " + test.getLength() + "\n");
		
		Word test2 = new Word("alligator");
      out.println(test2);
      out.println("num vowels == " + test2.getNumVowels());
      out.println("num chars == " + test2.getLength() + "\n");
		
      Word test3 = new Word("elephant");
      out.println(test3);
      out.println("num vowels == " + test3.getNumVowels());
      out.println("num chars == " + test3.getLength());
		
		//add more test cases
		
		
		
		
		
	}
}
