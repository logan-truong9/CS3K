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

public class Lab06d
{
	public static void main ( String[] args ) throws IOException
	{
      Scanner file = new Scanner(new File("lab06d.dat"));
      ArrayList<SiteName> site = new ArrayList<>();
      if (file.hasNextInt()) {
         int numSites = file.nextInt();
      }
      while (file.hasNext()) {
         site.add(new SiteName(file.next()));
      }
      
      Collections.sort(site);
      
      for (SiteName s : site) {
         out.println(s);
      }
         
	}
}
