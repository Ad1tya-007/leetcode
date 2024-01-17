package Easy;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String ans = "";
        String ref = strs[0];
        for (int i = 1; i <= ref.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(ref.substring(0, i))) {
                    return ans;
                }
            }
            ans = ref.substring(0, i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] strs1 = { "flower", "flower", "flower" };
        String[] strs2 = { "dog", "racecar", "car" };
        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
    }
}
