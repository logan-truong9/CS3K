//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Grid
{
   private String[][] grid;

	public Grid()
	{
      grid = new String[0][0];
	}

	public Grid(int rows, int cols, String[] vals)
	{
       setGrid(rows, cols, vals);
	}
	
	public void setGrid(int rows, int cols, String[] vals)
	{
      grid = new String[rows][cols];
      for (int r = 0; r < rows; ++r) {
         for (int c = 0; c < cols; ++c) {
            grid[r][c] = vals[(int)(Math.random() * vals.length)];
         }
      }  
      
	}

	public int findMax(String val)
	{
		int count=-1;
		return count;
	}

	private int findMax(int r, int c, String search)
	{
		return 0;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}