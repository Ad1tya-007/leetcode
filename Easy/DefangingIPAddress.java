package Easy;

public class DefangingIPAddress {

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static String defangIPaddr2(String address) {
        String ans = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                ans += "[.]";
            } else {
                ans += address.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr("1.1.1.1").equals("1[.]1[.]1[.]1"));
    }
}
