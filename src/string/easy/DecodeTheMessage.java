package string.easy;

import java.util.LinkedHashMap;

public class DecodeTheMessage {
    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    public static String decodeMessage(String key, String message) {
        char[] keyArray = key.replaceAll(" ", "").toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        int ind = 0;
        for (int i = 0; i < keyArray.length; i++) {
            if (!map.containsKey(keyArray[i])) {
                map.put(keyArray[i], ('a' + ind));
                ind++;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            var t = message.charAt(i);
            if (Character.isLetter(t)) {
                int val = map.get(t);
                char c = (char) val;
                ans.append(c);
            } else
                ans.append(t);
        }
        return ans.toString();
    }
}

