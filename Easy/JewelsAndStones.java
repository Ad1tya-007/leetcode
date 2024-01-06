package Easy;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int j = 0; j < jewels.length(); j++) {
            for (int i = 0; i < stones.length(); i++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aAb", "aaaAAAAbbbcccdddeee"));
    }

}
