package Programming_Questions;

// Given two strings, write a method to decide if one ia a permutation of the other

/* Ask the interviewer if the permutation comparison is case sensitive and
* white spaces are significant */

public class Check_Permutation {
    // Solution # 1: Sort the strings
    /* If two strings are permutations, then we know they have the same characters,
    * but in different orders. Therefore, sorting the strings will put the characters from
    * two permutations in the same order. We just need to compare the sorted versions of the strings. */
    String sort(String str) {
        char[] content = str.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    boolean permutation(String str, String t){
        if (str.length() != t.length()) {
            return false;
        }
        return sort(str).equals(sort(t));
    }
    // Solution # 2: Check if the two strings have identical character counts.
    /* Simply iterate through this code, counting how many times each character appears.
    * Then afterwards, we compare the two arrays. */
    boolean permutation_sol_2(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] letters = new int[128]; // Assumption ASCII
        char[] s_array = s.toCharArray();
        for (char c : s_array){ // count number of each char in s
            letters[c]++;
        }
        for (int i = 0; i < t.length(); i++){
            int c = (int) t.charAt(i);
            letters[c]--;
            if (letters[c] < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Check_Permutation cp = new Check_Permutation();
        System.out.println(cp.permutation("eat", "tea"));
    }
}
