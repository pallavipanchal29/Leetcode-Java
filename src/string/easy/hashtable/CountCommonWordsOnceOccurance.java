package string.easy.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountCommonWordsOnceOccurance {
    public static void main(String[] args) {
        String[] w1 = {"leetcode", "is", "amazing", "as", "is"};
        String[] w2 = {"amazing", "leetcode", "is"};
        System.out.println(countWords(w1, w2));
    }

    public static int countWords(String[] words1, String[] words2) {
        HashSet<String> ans = new HashSet<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < words1.length; i++) {
            map1.put(words1[i], map1.getOrDefault(words1[i], 0) + 1);
        }
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < words2.length; i++) {
            map2.put(words2[i], map2.getOrDefault(words2[i], 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == 1 && map2.containsKey(entry.getKey()) && map2.get(entry.getKey()) == 1)
                ans.add(entry.getKey());
        }
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            if (entry.getValue() == 1 && map1.containsKey(entry.getKey()) && map1.get(entry.getKey()) == 1)
                ans.add(entry.getKey());
        }
        return ans.size();
    }
}
