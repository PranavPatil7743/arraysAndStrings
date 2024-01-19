//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
public class IndexOfFirstOccur {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";

        int firstOccurrenceIndex = strStr(haystack,needle);

        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of '" + needle + "' starts at index: " + firstOccurrenceIndex);
        } else {
            System.out.println("Substring '" + needle + "' not found in the main string.");
        }
    }

    public static int strStr(String haystack, String needle) {
        int hayLen = haystack.length();
        int needleLen = needle.length();

        for (int i = 0; i <= hayLen - needleLen; i++) {
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}