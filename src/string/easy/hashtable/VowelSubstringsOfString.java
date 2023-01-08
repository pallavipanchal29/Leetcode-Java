package string.easy.hashtable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class VowelSubstringsOfString {
    public static void main(String[] args) {
        System.out.println(countVowelSubstrings("cuaieuouac"));
    }

    public static int countVowelSubstrings(String word) {
        int count = 0;
        Map<Character, Integer> lastSeen = new HashMap<>(Map.of('a', -1, 'e', -1, 'i', -1, 'o', -1, 'u', -1));
        for (int i = 0, lastInvalidPos = -1; i < word.length(); ++i) {
            if (lastSeen.containsKey(word.charAt(i))) {
                lastSeen.put(word.charAt(i), i);
                //count is incremented with index from min index of any vowel to last invalid positions as in between strings will be included by default
                //and its compared to zero as default values for each letter in map is zero so -1 - lastInvalidposition will come < 0
                // and its countered by 0 in max function
                count += Math.max(Collections.min(lastSeen.values()) - lastInvalidPos, 0);
            } else {
                lastInvalidPos = i;
            }
        }
        return count;
    }
}
