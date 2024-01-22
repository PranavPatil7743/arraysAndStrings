/*Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World ";
        System.out.println(lengthOfWord(s));
    }

    public static int lengthOfWord(String s) {
        int length = 0;
        String trimmed = s.trim(); //this will remove leading and trailing spaces
        String[] words = trimmed.split("\\s+");
        if (words.length > 0) {
            String lastword = words[words.length - 1];
            return lastword.length();
        } else {
            return 0;
        }
    }

    public static int lengthOfWord2(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (count > 0) {
                return count;
            }
        }
        return count;
    }
}
