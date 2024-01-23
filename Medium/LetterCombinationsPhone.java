package Medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhone {

    public static List<String> letterCombinations(String digits) {
        String[] letters = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> ans = new ArrayList<String>();
        if (digits.length() == 0) {
            return ans;
        }
        ans.add("");
        for (int i = 0; i < digits.length(); i++) {
            char d = digits.charAt(i);
            int x = Character.getNumericValue(d);

            List<String> temp = new ArrayList<>();
            for (int j = 0; j < letters[x].length(); j++) {
                char c = letters[x].charAt(j);

                for (int k = 0; k < ans.size(); k++) {
                    temp.add(ans.get(k) + c);
                }
            }

            ans = temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
