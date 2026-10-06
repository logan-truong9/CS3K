import java.util.HashSet;
import java.util.Set;

public class PermutationSet
{
   public static Set<String> permutations(String word) {
      // Make a HashSet to store the permutations of <code>word</code>
      Set<String> perm = new HashSet<>();
      // Throw a NPE
      if (word == null) {
         throw new NullPointerException("word can't be null");
      }
      // If `word` is the empty string, add it to your set before returning the set.
      if (word.length() == 0) {
         perm.add(word);
         return perm;
      }
      
      // Store the first character
      String firstChar = word.substring(0, 1);
      // Store the rest of the string
      String rem = word.substring(1, word.length());
      // Call permutations() on rem and store the set it gives you
      perm = permutations(rem);
      // Loop through each permutation of rem
         // Loop through each spot of the current word from rem 
            // Insert <code>init</code> at the current spot
            // Add this permutation to our set of permutations.
      String current = "";
      for (int j = 0; j < perm.size(); ++j) {
         for (int i = 0; i < rem.length(); ++i) {
            current = rem.substring(0, i) + firstChar + rem.substring(i);
            perm.add(current);
         }
      }
      return perm;
   }
}