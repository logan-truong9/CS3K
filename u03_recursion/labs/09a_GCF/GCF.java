//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import static java.lang.System.*;

public class GCF
{
	//instance variables, constructors, and other methods not shown 
	
	public static int gcf(int n1, int n2)
	{
      if (n1 <= 0 || n2 <= 0) {
         throw new IllegalArgumentException("Must be postive");
      }
		int remainder = n1 % n2;
		if (remainder == 0) {
		   return n2;
      }
      else {
         return gcf(n2, remainder);
      }
	}
}