//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.List;

class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
      setWords(wordList);
      
      //String[] ray = wordList.split(" ");
      //for (String str : ray) {
      //   words.add(new Word(str));
      //}
      
	}

	public void setWords(String wordList)
	{

      //if (wordList == null) {
      //   throw new NullPointerException("wordList cannot be null");
      //}
      words = new ArrayList<Word>();
      //Scanner scan = new Scanner(wordList);
      //while (scan.hasNextLine()) {
      //   Word word = new Word(scan.next());
      //   words.add(word);
      //}
      //String[] ray = wordList.split(" ");
      //for (String str : ray) {
      //   words.add(new Word(str));
      //}
      Scanner chopper = new Scanner(wordList);
      while(chopper.hasNext()) {
         words.add(new Word(chopper.next()));
      }
	}
   
   //public List<Word> getWords() {
   //   return (List<Word>)Collections.unmodifiableList(words);
   //}
	
	public int countWordsWithXChars(int size)
	{
		int count= String.valueOf(words.get(size)).length();
      

		return count;
	}
	
	public void removeWordsWithXChars(int size)
	{
      for (int i = 0; i < words.size(); ) {
         if(String.valueOf(words.get(i)).length() == size) {
            words.remove(i);
         }
         else {
            ++i;
         }
      }


	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
      for (int i = 0; i < words.size(); ++i) {
         if(words.get(i).getNumVowels() == numVowels) {
            ++count;
         }
      }

		return count;
	}
	
	public String toString()
	{
	   return "" + words;
	}
}
