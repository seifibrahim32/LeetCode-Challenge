import java.util.HashMap;

public class ValidAnagrams {
    class Solution {
        public boolean isAnagram(String s, String t) {
            // initialize hashmaps
            HashMap< Character, Integer > hashmap1 = new HashMap < Character, Integer > ();
            HashMap < Character, Integer > hashmap2 = new HashMap < Character, Integer > ();
            //convert string to character array
            char arr1[] = s.toCharArray();
            char arr2[] = t.toCharArray();
            //for loop for first string
            for (int i = 0; i < arr1.length; i++) {
                //if character not present add to hashmap
                if (hashmap1.get(arr1[i]) == null) {

                    hashmap1.put(arr1[i], 1);
                } else {
                    Integer c = (int) hashmap1.get(arr1[i]);
                    hashmap1.put(arr1[i], ++c);
                }
            }
            //for loop for second string
            for (int j = 0; j < arr2.length; j++) {

                if (hashmap2.get(arr2[j]) == null)
                    hashmap2.put(arr2[j], 1);
                else {

                    Integer d = (int) hashmap2.get(arr2[j]);
                    hashmap2.put(arr2[j], ++d);
                }
            }
            //check if hashmaps are equal
            if (hashmap1.equals(hashmap2))
                return true;
            else
                return false;

        }
    }
}
