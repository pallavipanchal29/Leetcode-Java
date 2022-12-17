package string.easy.hashtable;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!map.containsKey(ransomNote.charAt(i))) return false;
            else {
                int val = map.get(ransomNote.charAt(i));
                if (val > 1)
                    map.put(ransomNote.charAt(i), val - 1);
                else
                    map.remove(ransomNote.charAt(i));
            }
        }
        return true;
    }
}
