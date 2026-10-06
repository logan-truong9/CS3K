//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;

public class Word implements Comparable<Word>
{
	//add an instance variable and a constructor
   
   String str = "";
   
   public Word(String s) {
      str = s;
   }

	//add a compareTo
   public int compareTo(Word other) {
      if (this.str.length() > other.str.length()) {
         return 1;
      }   
      if (this.str.length() < other.str.length()) {
         return -1;
      }
      return this.str.compareTo(other.str);
   }

	//add a toString
   
   public String toString() {
      return str;   
   }
}