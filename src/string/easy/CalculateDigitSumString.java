package string.easy;

import java.util.ArrayList;
import java.util.List;

public class CalculateDigitSumString {
    public static void main(String[] args) {
        System.out.println(digitSum("4757303852581", 13));
    }

    public static String digitSum(String s, int k) {
        int len = s.length();
        while (len > k) {
            List<String> parts = new ArrayList<>();
            int i = 0;
            while (i < s.length()) {
                String part = s.substring(i, Math.min(i + k, s.length()));
                parts.add(part);
                i = i + k;
            }
            StringBuilder newS = new StringBuilder();
            for (int j = 0; j < parts.size(); j++) {
                int sum = 0;
                String part = parts.get(j);
                for (int n = 0; n < part.length(); n++) {
                    sum = sum + Integer.parseInt(String.valueOf(part.charAt(n)));
                }
                newS.append(sum);
                s = newS.toString();
                len = newS.length();
            }
        }
        return s;
    }
}
