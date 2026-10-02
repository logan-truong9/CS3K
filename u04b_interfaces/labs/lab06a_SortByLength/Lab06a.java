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

public class Lab06a
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
      Scanner file = new Scanner (new File("lab06.dat"));
      ArrayList<String> list = new ArrayList<>();
      ArrayList<Word> words = new ArrayList<>();
      while (file.hasNext()) {
         list.add(file.next());
      }
      for (int i = 1; i < list.size(); ++i) {
         words.add((Word)list.get(i));
      }
      Word test = new Word(words);
      
	}
}