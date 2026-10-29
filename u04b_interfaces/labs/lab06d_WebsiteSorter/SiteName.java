//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class SiteName implements Comparable<SiteName>
{
	//add instance variables
   private String name;
	private String category;
	
	//add a constructor
   public SiteName(String url) {
      int dotIndex = url.indexOf(".");
      if (dotIndex != -1) {
         this.name = url.substring(0, dotIndex);
         this.category = url.substring(dotIndex + 1);
      }
      else {
         this.name = url;
         this.category = "";
      }
   }

	//add a compareTo
   public int compareTo(SiteName other) {
      if (this.category.compareTo(other.category) == 0) {
         return this.name.compareTo(other.name);
      }
      else {
         return this.category.compareTo(other.category);
      }
      
   }

	//add a toString
   public String toString() {
      return name + "." + category;
   }
}