package Programming_Questions;

/* Is Unique: Implement an algorithm to determine if a string has all unique characters.
* What if you cannot use additional data structures? */

public class IsUnique {
    /* You should first ask your interviewer if the string is an ASCII string or a Unicode
    * string. If it is not, you should increase the storage size.*/
    boolean isUniqueCharacters(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]){ // Already found this char in string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

//  The space usage can be reduce by a factor of eight by using a bit vector.
// the method below only uses the lowercase letters a - z. This will allow the use of single int
boolean IsUniqueChars(String str) {
        int checker = 0;
        for(int i = 0; i < str.length(); i++){
           int val = str.charAt(i) - 'a';
           if ((checker & ( 1 << val)) > 0) {
               return false;
           }
           checker |= (1 << val);
        }
        return true;
}

    public static void main(String[] args) {
        IsUnique unique_chars = new IsUnique();
      System.out.println(unique_chars.isUniqueCharacters("The man who knew infinity"));
    }
}
/* The time complexity for this code is O(n), where n is the length of the string. The space complexity is O(1).
* You can also argue the time complexity is O(1), since the for loop will never iterate through more than 128 characters.
* if you didn't assume the character set is fixed, you could express the complexity as O(c) space and O(min(c, n)) or O(c) time
* where c is the size of the character set. */