package Programming_Questions;

public class OneAway {
    /* There are three types of edits that can be performed on strings: insert a character,
    * remove a character, or replace a character. Given two strings, write a function
    * to check if they are one edit or zero edits away. */

    boolean oneEditAway(String first, String second){
        if (first.length() == second.length()){
            return oneEditReplace(first, second);
        }
        else if (first.length() + 1 == second.length()){
            return oneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneEditInsert(second, first);
        }
        return false;
    }
    boolean oneEditReplace(String s1, String s2){
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                if (foundDifference){
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }
    // Check if you can insert a character into s1 to make s2
    boolean oneEditInsert(String s1, String s2){
        int index1 = 0;
        int index2 = 0;
        while(index2 < s2.length() && index1 < s1.length()){
            if (s1.charAt(index1) != s2.charAt(index2)){
                if (index1 != index2){
                    return false;
                }
                index2++;
            }else {
                index1++;
                index2++;
            }
        }
        return true;
    }
    /* This algorithm and almost any reasonable algorithm takes O(n)
    * time, where n is the length of the shorter string. */

    /* Why is the runtime dictated by the shorter string instead of the longer string?
    * if the strings are the same length plus or minus character, then it doesn't matter
    * whether we use the longer string or shorter string to define the runtime. If the strings are very
    * different lengths, then the algorithm will terminate in O(1) time. One really, really
    * long string therefore won't significantly extend the runtime. It increases the runtime only if both strings
    * are long. */
}
