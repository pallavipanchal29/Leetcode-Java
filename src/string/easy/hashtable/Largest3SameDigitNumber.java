package string.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class Largest3SameDigitNumber {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("11777100848222596198895956272537536733077711172441118756087562211111171951039366777406380"));
    }

    public static String largestGoodInteger(String num) {
        if (num.length() <= 1)
            return "";

        Map<Integer, String> stringMap = new HashMap<>();

        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 2) && num.charAt(i) == num.charAt(i + 1))
                stringMap.putIfAbsent(num.charAt(i) - '0', num.substring(i, i + 3));
        }

        for (int i = 9; i >= 0; i--)
            if (stringMap.containsKey(i))
                return stringMap.get(i);

        return "";
    }
}
