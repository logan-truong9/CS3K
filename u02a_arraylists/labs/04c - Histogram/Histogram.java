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
      count = new ArrayList<Integer>();
      letters = new ArrayList<Character>();
      fileName = "";
	}

	public Histogram(char[] values, String fName)
	{
      count = new ArrayList<Integer>();
      letters = new ArrayList<Character>();
      fileName = fName;
		
      
      for (char c : values) {
         letters.add(c);
         count.add(0);
      }
      
      out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
      Scanner scan = new Scanner(new File(fileName));
      while (scan.hasNextLine()) {
         String line = scan.nextLine();
         for (int i = 0; i < line.length(); ++i) {
            char c = line.charAt(i);
            int index = letters.indexOf(c);
            if (index!=-1) {
               count.set(index, count.get(index) + 1);
            }
         }
      }
      scan.close();
	}

	public char mostFrequent()
	{
      if (count.isEmpty()) {
         return '#';
      }
      
      int maxIndex = 0;
      for (int i = 1; i < count.size(); ++i) {
         if (count.get(i) > count.get(maxIndex)) {
            maxIndex = i;
         }
      }
      return letters.get(maxIndex);
	}

	public char leastFrequent()
	{
		if (count.isEmpty()) {
         return '#';
      }
      
      int minIndex = 0;
      for (int i = 1; i < count.size(); ++i) {
         if (count.get(i) < count.get(minIndex)) {
            minIndex = i;
         }
      }
      return letters.get(minIndex);

	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}
