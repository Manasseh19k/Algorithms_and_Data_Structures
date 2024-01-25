package Programming_Questions;

/* Given a string write a function to check if it is a permutation of a palindrome.
* A palindrome is a word or phrase that is the same forwards and backwards.
* A permutation is a rearrangement of letters. The palindrome does not need
* to be limited to just dictionary words. */

public class Palindrome_Permutation {
    // Solution #1: This algorithm takes O(N) time, where N is the length of the string

    /* Use a hash table to count how many times each character appears.
    * Then, iterate through the hash table and ensure that no more than one character
    * has an odd count. */
    boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }
    // Check that no more than one character has an odd count.
    boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table){
            if (count % 2 == 1){
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }
    /* Map each character to a number. a > 0, b > 1, c > 2, e.t.c
    * This is case insensitive. Non-letter characters map to -1 */
    int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z){
            return val - a;
        }
        return -1;
    }
    // Count how many times each character appears.
    int[] buildCharFrequencyTable(String phrase){
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()){
            int x = getCharNumber(c);
            if (x != -1){
                table[x]++;
            }
        }
        return table;
    }
//    Solution # 2:
    /* We can't optimize the big O time here since any algorithm will always have to look through the
    * entire string. However, we can make some smaller incremental improvements. Because this is a relatively simple
    * problem, it can be worthwhile to discuss some small optimizations or at least some tweaks.
    * Instead of checking the number of odd counts at the end, we can check as we go along.
    * Then, as soon as we get to the end, we have our answer. */
    boolean isPermutationOfPalindrome_S_2(String phrase){
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()){
            int x = getCharNumber(c);
            if (x != -1){
                table[x]++;
                if (table[x] % 2 == 1){
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
        /* It's important to be very clear that this is not necessarily more optimal. it has the same big O time and
        * might even be slightly slower. We have eliminated a final iteration through the hash table, we now
        * we have to run a few extra lines of code for each character in the string. */
    }

    public static void main(String[] args) {
        Palindrome_Permutation pp = new Palindrome_Permutation();
        System.out.println("Solution_1: " + pp.isPermutationOfPalindrome("Tact Cao"));
        System.out.println("Solution_2: " + pp.isPermutationOfPalindrome_S_2("Tact Cao"));
    }
}
