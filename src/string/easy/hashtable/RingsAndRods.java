package string.easy.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RingsAndRods {
    public static void main(String[] args) {
        System.out.println(countPoints("G4"));
    }

    public static int countPoints(String rings) {
        int count = 0;
        HashMap<Integer, HashSet<Character>> map = new HashMap<>();
        for (int i = 0; i < rings.length(); i = i + 2) {
            Character c = rings.charAt(i);
            int r = rings.charAt(i + 1);
            if (map.containsKey(r)) {
                var set = map.get(r);
                set.add(c);
            } else {
                HashSet<Character> set = new HashSet<>();
                set.add(c);
                map.put(r, set);
            }
        }
        for (Map.Entry<Integer, HashSet<Character>> entry : map.entrySet()) {
            var set = entry.getValue();
            if (set.size() == 3)
                count++;
        }
        return count;
    }
}
