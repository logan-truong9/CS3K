
//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class SpiralMatrix
{
	//define a matrix
   private int[][] spiral;

	public SpiralMatrix()
	{
      spiral = new int[0][0];
	}

	public SpiralMatrix(int size)
	{
      if (size <= 0) {
         throw new IllegalAugmentException("The size must be postive!");
      }
      spiral = new int[size][size];
      createSpiral(size);
	}
	
	public void setSize(int size)
	{
      spiral = new int[size][size];
	}

	public void createSpiral(int size)
	{
      int num = 1;
      //int r = 0;
      //int c = 0;
      //spiral[r][c] = num;
      while (
      for (int r = 0; r < spiral.length() ++r) {
         
	}

	public String toString( )
	{
		String output="";
      for (int row = 0; row < spiral.length; ++row) {
         for (int col = 0; col < spiral[r].length; ++col) {
            output += spiral[r][c] + "\t";
         }
         output += "\n";
      }
		return output;
	}
}

