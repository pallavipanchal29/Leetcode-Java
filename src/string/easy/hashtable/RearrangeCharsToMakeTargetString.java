package string.easy.hashtable;

import java.util.HashMap;

public class RearrangeCharsToMakeTargetString {
    public static void main(String[] args) {
        System.out.println(rearrangeCharacters("ilovecodingonleetcode", "code"));
    }

    public static int rearrangeCharacters(String s, String target) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        Boolean isPos = true;
        while (isPos) {
            int j = 0;

            while (isPos && j < target.length()) {
                if (map.containsKey(target.charAt(j))) {
                    if (map.get(target.charAt(j)) > 1)
                        map.put(target.charAt(j), map.get(target.charAt(j)) - 1);
                    else
                        map.remove(target.charAt(j));
                } else
                    isPos = false;
                j++;
            }
            if (isPos) count++;
        }
        return count;
    }
}
