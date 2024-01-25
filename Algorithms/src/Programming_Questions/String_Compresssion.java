package Programming_Questions;

public class String_Compresssion {
    /* Implement a method to perform basic string compression using the counts
    * of repeated characters. For example, the string aabcccccaaa would become
    * a2b1c5a3. If the "compressed" string would not become smaller than the
    * original string, your method should return the original string. You can
    * assume the string has only uppercase and lowercase letters (a-z)*/
    String compressedBad(String str){
        StringBuilder compressedString = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++){
            countConsecutive++;

            // If next character is different from current, append this char to result
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
                compressedString.append(str.charAt(i));
                compressedString.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressedString.length() < str.length() ? compressedString.toString() : str;
    }
}
/* The runtime O(p + k^2), where p is the size of the original string and k is the number
* of character sequences. */