package string.easy.hashtable;

import java.util.TreeMap;

public class RemoveLetterEqualizeFrequency {
    public static void main(String[] args) {
        System.out.println(equalFrequency("ddaccb"));
    }

    public static boolean equalFrequency(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : count) {
            if (num == 0) {
                continue;
            }
            int freq = map.getOrDefault(num, 0);
            map.put(num, freq + 1);
        }
        var first = map.firstKey();
        if (map.size() == 2 && map.firstKey() + 1 == map.lastKey() && map.get(map.lastKey()) == 1) {
            return true;
        }
        if (map.size() == 2 && map.firstKey() == 1 && map.get(map.firstKey()) == 1) {
            return true;
        }
        if (map.size() == 1) {
            return map.firstKey() == 1 || map.get(map.firstKey()) == 1;
        }
        return false;
    }
}
