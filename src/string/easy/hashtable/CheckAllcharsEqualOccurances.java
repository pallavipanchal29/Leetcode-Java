package string.easy.hashtable;

import java.util.HashMap;

public class CheckAllcharsEqualOccurances {
    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abacbc"));
    }

    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int occ = (int) map.values().toArray()[0];
        for (int i : map.values()) {
            if (i != occ)
                return false;
        }
        return true;
    }
}
