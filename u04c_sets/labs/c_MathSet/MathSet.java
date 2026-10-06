//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;
import java.util.Scanner;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
      one = new TreeSet<>();
      two = new TreeSet<>();
	}

	public MathSet(String o, String t)
	{
      one = new TreeSet<>();
      two = new TreeSet<>();
      
      Scanner chop1 = new Scanner(o);
      while (chop1.hasNextInt()) {
         one.add(chop1.nextInt());
      }
      
      Scanner chop2 = new Scanner(t);
      while (chop2.hasNextInt()) {
         two.add(chop2.nextInt());
      }
	}

	public Set<Integer> union()
	{
      Set<Integer> result = new TreeSet<>(one);
      result.addAll(two);
		return result;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> result = new TreeSet<>(one);
      result.retainAll(two);
		return result;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> result = new TreeSet<>(one);
      result.removeAll(two);
		return result;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> result = new TreeSet<>(two);
		result.removeAll(one);
		return result;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> uni = union();
		Set<Integer> inter = intersection();
		uni.removeAll(inter);
		return uni;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" + "Set two " + two + "\n" + "\n" +
		       "union - " + union() + "\n" +
		       "intersection - " + intersection() + "\n" +
		       "difference A-B - " + differenceAMinusB() + "\n" +
		       "difference B-A - " + differenceBMinusA() + "\n" +
		       "symmetric difference " + symmetricDifference() + "\n\n";
	}
}