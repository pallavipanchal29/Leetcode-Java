package string.easy.hashtable;

import java.util.HashMap;

public class LargestSubstringTwoEqualChars {
    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("aa"));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                max = Math.max(i - map.get(s.charAt(i)) - 1, max);
            } else
                map.put(s.charAt(i), i);
        }
        return max == Integer.MIN_VALUE ? -1 : max;
    }
}
