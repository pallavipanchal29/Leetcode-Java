package string.easy.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {
    public static void main(String[] args) {
        List<String> ans = commonChars(new String[]{"bella", "label", "roller"});
        for (String i : ans)
            System.out.print(i + " ");
    }

    public static List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : words[0].toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> tmp = new HashMap<>();//intersection
            for (char c : words[i].toCharArray())
                if (map.containsKey(c)) {
                    Integer freq = tmp.get(c);
                    tmp.put(c, Math.min(map.get(c), (freq == null ? 1 : freq + 1)));
                }
            map = tmp;
        }

        for (char c : map.keySet())
            for (int i = 0; i < map.get(c); i++)
                list.add(String.valueOf(c));
        return list;
    }
}
