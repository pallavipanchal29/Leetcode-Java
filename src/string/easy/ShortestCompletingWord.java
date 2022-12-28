package string.easy;

import java.util.*;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        String[] words = {"measure", "other", "every", "base", "according", "level", "meeting", "none", "marriage", "rest"};
        System.out.println(shortestCompletingWord("GrC8950", words));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        LinkedHashMap<String, Integer> ans = new LinkedHashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();
        licensePlate = licensePlate.toLowerCase();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (Character.isLetter(licensePlate.charAt(i))) {
                map.put(licensePlate.charAt(i), map.getOrDefault(licensePlate.charAt(i), 0) + 1);
            }
        }
        for (int i = 0; i < words.length; i++) {
            boolean contains = true;
            String word = words[i];
            HashMap<Character, Integer> t = new HashMap<>();
            for (int j = 0; j < word.length(); j++) {
                if (Character.isLetter(word.charAt(j))) {
                    t.put(word.charAt(j), t.getOrDefault(word.charAt(j), 0) + 1);
                }
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (!t.containsKey(entry.getKey()) || t.get(entry.getKey()) < entry.getValue()) {
                    contains = false;
                    break;
                }

            }
            if (contains)
                ans.put(word, word.length());
        }
        if (ans.size() == 0) return " ";
        List<Map.Entry<String, Integer>> li = new ArrayList<>(ans.entrySet());
        Collections.sort(li, Comparator.comparing(Map.Entry::getValue));
        return li.get(0).getKey();
    }
}
