package string.easy.hashtable;

import java.util.*;

public class ResultantArrayAfterRemovingAnagrams {
    public static void main(String[] args) {
        List<String> ans = removeAnagrams(new String[]{"a", "b", "a"});
        for (String s : ans)
            System.out.print(s + " ");
    }

    public static List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        List<Map.Entry<String, String>> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            char[] t = words[i].toCharArray();
            Arrays.sort(t);
            String sorted = String.valueOf(t);
            Map.Entry<String, String> entry = new AbstractMap.SimpleEntry<>(words[i], sorted);
            list.add(entry);
        }
        int i = 0;
        while (i < list.size()) {
            ans.add(list.get(i).getKey());
            String val = list.get(i).getValue();
            int j = i + 1;

            while (j < list.size() && list.get(j).getValue().equals(val)) {
                j++;
            }
            i = j;
        }
        return ans;
    }
}
