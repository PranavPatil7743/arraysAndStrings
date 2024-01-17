import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String string = "MusKaanK";
        duplicates(string);
        System.out.println();
    }

    public static void duplicates(String input) {

        Set<Character> charSet = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for (char characters : input.toCharArray()) {
            if (!charSet.add(characters)) {
                duplicates.add(characters);
            }
        }
        System.out.println(duplicates);
    }
}
