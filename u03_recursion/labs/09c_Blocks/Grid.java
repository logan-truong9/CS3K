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
      int max = 0;
      for (int r = 0; r < grid.length; ++r) {
         for (int c =  0; c < grid[r].length; ++c) {
        
            int count = findMax(r, c, val);
            if (count > max) {
               max = count;
            }
            
         } 
         
      }
		return max;

	}

	private int findMax(int r, int c, String search)
	{
      if ((r > 0 && r < grid.length - 1) && (c > 0 && c < grid[c].length - 1) && grid[r][c].equals(search)) {
               grid[r][c] = " ";
               return 1
               + findMax(r - 1, c, search)
               + findMax(r + 1, c, search)
               + findMax(r, c - 1, search)
               + findMax(r, c + 1, search);
            }
       return 0;

	}

	public String toString()
	{
		String output="";
      for (int row = 0; row < grid.length; ++row) {
         for (int col = 0; col < grid[row].length; ++col) {
            output += grid[row][col];
         }
         output += "\n";
      }
		return output;
	}
}