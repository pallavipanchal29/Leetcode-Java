package string.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));
    }

    public static char repeatedCharacter(String s) {
        int min = Integer.MAX_VALUE;
        char c = ' ';
        HashMap<Character, Pair> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), new Pair(i, 1));
            } else {
                var p = map.get(s.charAt(i));
                p.count++;

                if (p.index < min)
                    return s.charAt(i);
                p.index = i;
            }
        }
        for (Map.Entry<Character, Pair> entry : map.entrySet()) {
            var pair = entry.getValue();
            if (pair.count == 1)
                min = Math.min(pair.index, min);
        }

        return ' ';
    }
}
