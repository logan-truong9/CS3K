//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   int atCount = 0;

	public AtCounter() {
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c) {

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]

      if ((r < atMat.length && r >= 0) && (c < atMat[r].length && c >= 0) && atMat[r][c] == '@') {
      
            //++atCount;
            //atMat[r][c] = ' ';
            //countAts(r - 1, c);
            //countAts(r + 1, c);
            //countAts(r, c - 1);
            //countAts(r, c + 1);
            atMat[r][c] = ' ';
            return 1 + countAts(r - 1, c) + countAts(r + 1, c) + countAts(r, c - 1) + countAts(r, c + 1);
         
      }
      return 0;
      
      
	}

	public String toString() {
		String output="";
		output+=atCount+" @s connected.";
		return output;
	}
}
