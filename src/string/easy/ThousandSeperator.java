package string.easy;

import java.util.ArrayList;
import java.util.List;

public class ThousandSeperator {
    public static void main(String[] args) {
        System.out.println(thousandSeparator(1234));
    }

    public static String thousandSeparator(int n) {
        StringBuilder ans = new StringBuilder();
        String num = String.valueOf(n);
        String rev = new StringBuilder(num).reverse().toString();

        List<String> parts = new ArrayList<>();
        for (int i = 0; i < rev.length(); i = i + 3) {
            String p = rev.substring(i, Math.min(rev.length(), i + 3));
            parts.add(p);

        }
        for (String s : parts) {
            ans.append(s);
            ans.append(".");
        }
        return ans.reverse().substring(1);
    }
}
