//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MagicSquare
{
	private int[][] magicSquare;

	public MagicSquare()
	{
		setSize(0);
	}

	public MagicSquare(int size)
	{
      if (size <=0) {
         throw new IllegalArgumentException("The size must be positive!");
      }
      magicSquare = new int[size][size];
      createMagic(size);
	}
	
	public void setSize(int size)
	{
      magicSquare = new int[size][size];
	}

	public void createMagic(int size)
	{
      int r = 0;
      int c = magicSquare.length/2;
		magicSquare[r][c] = 1;
      int num = 1;
      //for (int num = 1; num < size * size; ) {
      while (num < size * size) {  
         --r;
         if (r < 0) {
            r = magicSquare.length - 1;
         }
            
         ++c;
         if (c > magicSquare[r].length -1) {
            c = 0;
         }
            
            
         ++num;
         
         if (magicSquare[r][c] != 0) {
            ++r;
            if (r > magicSquare.length - 1) {
               r = 0;
            }
            
            --c;
            if (c < 0) {
               c = magicSquare[r].length - 1;
            }
            
            ++r;
            if (r > magicSquare.length - 1) {
               r = 0;
            }
            
            
            
         }
         
         magicSquare[r][c] = num;   
      }
   }
	

	public String toString( )
	{
		String output="";
      for (int row = 0; row < magicSquare.length; ++row) {
         for (int col = 0; col < magicSquare[row].length; ++col) {
            output += magicSquare[row][col];
            output += "\t";
         }
         output += "\n";
      }
		return output;
	}
}

