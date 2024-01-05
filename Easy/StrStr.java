package Easy;

/* 
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, 
or -1 if needle is not part of haystack.
*/

public class StrStr {

    // soln 1 => fastest
    static public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    // soln 2 => fast but uses slightly less memory
    static public int strStr2(String haystack, String needle) {
        if (haystack.length() < 1 || needle.length() < 1) {
            return -1;
        }
        int len1 = haystack.length();
        int len2 = needle.length();
        if (len2 > len1) {
            return -1;
        }
        for (int i = 0; i < len1; i++) {
            if (!Character.isLowerCase(haystack.charAt(i))) {
                return -1;
            }
        }
        for (int i = 0; i < len2; i++) {
            if (!Character.isLowerCase(needle.charAt(i))) {
                return -1;
            }
        }

        for (int i = 0; i < (len1 - len2 + 1); i++) {
            String str = haystack.substring(i, i + len2);
            if (str.contains(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("estest", "test"));
        System.out.println(strStr2("sadbutsad", "sad"));
        System.out.println(strStr2("estest", "test"));
    }
}
