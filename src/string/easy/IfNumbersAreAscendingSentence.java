package string.easy;

import java.util.ArrayList;
import java.util.List;

public class IfNumbersAreAscendingSentence {
    public static void main(String[] args) {
        System.out.println(areNumbersAscending("hello world 5 x 5"));
    }

    public static boolean areNumbersAscending(String s) {
        List<Integer> num = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                temp = temp + s.charAt(i);
            } else {
                if (temp != "") {
                    int n = Integer.parseInt(temp);
                    int last = num.size() > 0 ? num.get(num.size() - 1) : -1;
                    if (n <= last)
                        return false;
                    num.add(n);
                    temp = "";
                }
            }
        }

        return temp == "" || Integer.parseInt(temp) > num.get(num.size() - 1);
    }
}
