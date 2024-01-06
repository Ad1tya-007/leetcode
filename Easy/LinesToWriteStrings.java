package Easy;

public class LinesToWriteStrings {

    public static int[] numberOfLines(int[] widths, String s) {

        int lines = 1;
        int widthOfLastLine = 0;
        for (int i = 0; i < s.length(); i++) {
            widthOfLastLine += widths[s.charAt(i) - 'a'];
            if (widthOfLastLine > 100) {
                widthOfLastLine = widths[s.charAt(i) - 'a'];
                lines++;
            }
        }
        int[] ans = new int[2];
        ans[0] = lines;
        ans[1] = widthOfLastLine;
        // System.out.println("[ " + ans[0] + "," + ans[1] + " ]");
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(numberOfLines(
                new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                        10, 10, 10, 10, 10 },
                "abcdefghijklmnopqrstuvwxyz"));

        System.out.println(numberOfLines(
                new int[] { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                        10, 10,
                        10 },
                "bbbcccdddaaa"));
    }
}
