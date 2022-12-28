package string.easy.hashtable;

import java.util.*;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aadadaad"));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> removed = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.remove(s.charAt(i));
                removed.add(s.charAt(i));
            } else {
                if (!removed.contains(s.charAt(i))) map.put(s.charAt(i), i);
            }
        }
        List<Map.Entry<Character, Integer>> li = new ArrayList<>(map.entrySet());
        Collections.sort(li, Comparator.comparing(Map.Entry::getValue));
        return li.size() == 0 ? -1 : li.get(0).getValue();
    }

}
