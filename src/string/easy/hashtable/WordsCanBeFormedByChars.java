package string.easy.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordsCanBeFormedByChars {
    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        System.out.println(countCharacters(words, "atach"));
    }

    public static int countCharacters(String[] words, String chars) {
        int count = 0;
        int[] c = new int[26];
        for (int i = 0; i < chars.length(); i++)
            c[chars.charAt(i) - 'a']++;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < word.length(); j++)
                map.put(word.charAt(j), map.getOrDefault(word.charAt(j), 0) + 1);
            List<Character> temp = new ArrayList<>();
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (c[entry.getKey() - 'a'] < entry.getValue()) continue;
                else
                    temp.add(entry.getKey());
            }
            for (Character ch : temp)
                map.remove(ch);
            if (map.size() == 0)
                count = count + word.length();
        }
        return count;
    }
}
