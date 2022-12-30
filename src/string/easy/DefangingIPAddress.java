package string.easy;

public class DefangingIPAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.')
                sb.append("[.]");
            else sb.append(c);
        }
        return sb.toString();
    }
}
