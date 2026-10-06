//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06b
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases		
      Scanner file = new Scanner (new File("lab06b.dat"));
      
      ArrayList<VowelWord> vowel = new ArrayList<>();
      while (file.hasNext()) {
         vowel.add(new VowelWord(file.next()));
      }
      
      Collections.sort(vowel);
      
      for (VowelWord v : vowel) {
         out.println(v);
      }
      
	}
}