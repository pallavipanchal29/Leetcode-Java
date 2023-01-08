package string.easy.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IfOneStringSwapMakesStringsEqual {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("attack", "defend"));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++)
            map1.put(s1.charAt(i), i);

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s2.length(); i++)
            map2.put(s2.charAt(i), i);
        int diff = 0;
        HashSet<Character> set = new HashSet<>();
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                if (entry.getValue() != map2.get(entry.getKey()))
                    diff++;
            } else
                diff++;
        }
        return diff == 2;
    }
}
