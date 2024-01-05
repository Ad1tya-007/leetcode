package Easy;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int num = 0;
        for (String word : s.split(" ")) {
            if (word.isBlank()) {
                continue;
            }
            num = word.length();
        }
        return num > 0 ? num : 0;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord("    "));
    }
}
