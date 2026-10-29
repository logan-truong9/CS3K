//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Number implements Comparable<Number>
{

	//add in instance variables
   private String number;
   private int base;
   private int base10;
   private String binary;
	
	//add in a constructor or two
   
   public Number(String n, int b) {
      number = n;
      base = b;
      
      base10 = Integer.parseInt(n, b);
      binary = Integer.toBinaryString(base10);

   }

   

	public int compareTo(Number param)
	{
		if (Integer.bitCount(this.base10) > Integer.bitCount(param.base10)) {
         return 1;
      }
      if (Integer.bitCount(this.base10) < Integer.bitCount(param.base10)) {
         return -1;
      }
      if (this.base10 > param.base10) {
         return 1;
      }
      if (this.base10 < param.base10) {
         return -1;
      }
      return 0;
      
	}
	
   // Return these four items in this order, separated by a SPACE:
   //  * the original number
   //  * the base of the original number
   //  * the base 10 representation
   //  * the binary representation
	public String toString( )
	{
	  return number + " " + base + " " + base10 + " " + binary;
	}
}
