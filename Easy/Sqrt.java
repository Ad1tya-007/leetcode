package Easy;

/* 
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
*/

public class Sqrt {
    public static int mySqrt(int x) {
        if (x < 0)
            return -1;
        int a = 1;
        int b = x;
        int ans = 0;
        while (a <= b) {
            int c = a + (b - a) / 2;
            if (c <= x / c) {
                ans = c;
                a = c + 1;
            } else {
                b = c - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println("Root of " + i + " is " + mySqrt(i));
        }
        System.out.println(mySqrt(2147483647));
    }

}
