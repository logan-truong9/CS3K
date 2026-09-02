//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
      
	}

	public Histogram(char[] values, String fName)
	{
		out.println("search letters = "+letters);
      letters = new ArrayList<Character>();
      fileName = fName;
      for (int i = 0; i < values.length; ++i) {
         letters.add(values[i]);
      }
	}

	public void loadAndAnalyzeFile() throws IOException
	{
      Scanner scan = new Scanner(new File("lab04c1.dat"));
      while (scan.hasNextLine()) {
         String line = scan.nextLine();
         
         for (
	}

	public char mostFrequent()
	{
      for (int i = 0; i < f
		return '#';
	}

	public char leastFrequent()
	{
		return '#';
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}
