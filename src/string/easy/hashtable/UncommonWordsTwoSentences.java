package string.easy.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsTwoSentences {
    public static void main(String[] args) {
        String[] ans = uncommonFromSentences("apple apple", "banana");
        for (String s : ans)
            System.out.print(s + " ");
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        List<String> ans = new ArrayList<>();
        String[] w1 = s1.split(" ");
        HashMap<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < w1.length; i++) {
            map1.put(w1[i], map1.getOrDefault(w1[i], 0) + 1);
        }

        String[] w2 = s2.split(" ");
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < w2.length; i++) {
            map2.put(w2[i], map2.getOrDefault(w2[i], 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == 1 && !map2.containsKey(entry.getKey()))
                ans.add(entry.getKey());
        }
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            if (entry.getValue() == 1 && !map1.containsKey(entry.getKey()))
                ans.add(entry.getKey());
        }
        String[] res = new String[ans.size()];
        int ind = 0;
        for (String s : ans)
            res[ind++] = s;
        return res;

    }
}
