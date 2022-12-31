package string.easy;

import java.util.ArrayList;
import java.util.List;

public class ReformatString {
    public static void main(String[] args) {
        System.out.println(reformat("covid2019"));
    }

    public static String reformat(String s) {
        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c))
                letters.add(c);
            else digits.add(c);
        }
        if (Math.abs(digits.size() - letters.size()) > 1)
            return "";
        StringBuilder sb = new StringBuilder();
        int bidx = 0, sidx = 0;
        List<Character> bigger = digits.size() >= letters.size() ? digits : letters;
        List<Character> smaller = digits.size() < letters.size() ? digits : letters;
        // gotta find bigger, smaller to avoid scenarios like "1ab" instead of "a1b"
        sb.append(bigger.get(bidx++));
        while (bidx < bigger.size() || sidx < smaller.size()) {
            if (sidx < smaller.size())
                sb.append(smaller.get(sidx++));
            if (bidx < bigger.size())
                sb.append(bigger.get(bidx++));
        }
        return sb.toString();
    }
}
