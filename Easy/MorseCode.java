package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MorseCode {
    static String[] MorseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

    public static int uniqueMorseRepresentations(String[] words) {
        if (words.length == 0) {
            return 0;
        }
        if (words.length == 1) {
            return 1;
        }
        String[] new_words = new String[words.length];
        Arrays.fill(new_words, "");
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            for (int j = 0; j < temp.length(); j++) {
                new_words[i] = new_words[i] + MorseCode[temp.charAt(j) - 'a'];
            }
        }

        int count = 0;
        for (int i = 0; i < new_words.length; i++) {
            for (int j = i + 1; j < new_words.length; j++) {
                if (new_words[i] == "") {
                    continue;
                }
                if (new_words[i].equals(new_words[j])) {
                    new_words[j] = "";
                }
            }
        }

        for (int i = 0; i < new_words.length; i++) {
            if (new_words[i] != "") {
                count++;
            }
            System.out.println("[ " + new_words[i] + " ]");
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[] { "rwjje", "aittjje", "auyyn", "lqtktn", "lmjwn" }));
    }
}
