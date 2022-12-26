package string.easy.hashtable;

import java.util.TreeMap;

public class IncreasingDecreasingString {
    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));
    }

    public static String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        int index = 0;
        while (true) {
            StringBuilder current = new StringBuilder();
            for (Character c : map.keySet()) {
                if (map.get(c) != 0) {
                    current.append(c);
                    map.put(c, map.getOrDefault(c, 0) - 1);
                }
            }
            if ("".equals(current.toString())) break;
            if (index++ % 2 == 0) sb.append(current);
            else sb.append(current.reverse());
        }
        return sb.toString();

    }
}
