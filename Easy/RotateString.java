package Easy;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        return ((s + s).contains(goal));
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "abced")); // false
        System.out.println(rotateString("abcde", "cdeab")); // true
        System.out.println(rotateString("abcde", "cedba")); // false
        System.out.println(rotateString("abcde", "eabcd")); // true
        System.out.println(rotateString("abcde", "becda")); // false
    }
}
