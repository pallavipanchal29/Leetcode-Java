package string.easy.hashtable;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class GreatestEnglishLetterUpperLowerCase {
    public static void main(String[] args) {
        System.out.println(greatestLetter("AbCdEfGhIjK"));
    }

    public static String greatestLetter(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (Character.isLowerCase(entry.getKey()) && map.containsKey(Character.toUpperCase(entry.getKey())))
                return String.valueOf(entry.getKey()).toUpperCase();
        }
        return "";
    }
}
