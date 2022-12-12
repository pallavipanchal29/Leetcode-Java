package string.easy;

public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));
    }

    public static String addStrings(String num1, String num2) {
        int carry = 0;

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        String res = "";
        while (i >= 0 || j >= 0 || carry != 0) {
            int ival = i >= 0 ? num1.charAt(i) - '0' : 0;
            int jval = j >= 0 ? num2.charAt(j) - '0' : 0;

            i--;
            j--;

            int sum = ival + jval + carry;
            res = (sum % 10) + res;
            carry = sum / 10;
        }

        return res;
    }
}
