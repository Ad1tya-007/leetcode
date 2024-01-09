package Easy;

public class PalindromeNumbers {

    public static boolean isPalindrome(int x) {
        int originalX = x;
        int new_x = 0;

        while (x > 0) {
            new_x = new_x * 10 + x % 10;
            x = x / 10;
        }

        return originalX == new_x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
