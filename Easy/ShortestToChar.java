package Easy;

import java.util.ArrayList;
import java.util.List;

public class ShortestToChar {

    public static int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];

        List<Integer> idx = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                idx.add(i);
            }
        }

        // System.out.println(idx);

        for (int i = 0; i < s.length(); i++) {
            int temp = 0;
            for (int j = 0; j < idx.size(); j++) {
                if (i == idx.get(j)) {
                    temp = 0;
                    break;
                }
                if (temp == 0) {
                    temp = Math.abs(idx.get(j) - i);
                } else if (temp > Math.abs(idx.get(j) - i)) {
                    temp = Math.abs(idx.get(j) - i);
                }
            }
            ans[i] = temp;
            // System.out.println(ans[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(shortestToChar("test", 'e'));
        System.out.println(shortestToChar("tesste", 'e'));
    }

}
