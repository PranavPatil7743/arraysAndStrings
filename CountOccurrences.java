public class CountOccurrences {
    public static void main(String[] args) {
        String string = "PRANAVPATIL";
        char letter = 'Z';
        int count = countChar(string, letter);
        System.out.println(count);
    }

    public static int countChar(String input, char letter) {
        int count = 0;
        char[] result = input.toCharArray();
        for (int i = 1; i < result.length; i++) {
            if (result[i] == letter) {
                count++;
            }
        }
        return count;
    }
}
