package string.easy;

import java.util.*;

public class SlowestKey {
    public static void main(String[] args) {
        System.out.println(slowestKey(new int[]{9, 29, 49, 50}, "cbcd"));
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keysPressed.length(); i++) {
            int newDur = releaseTimes[i];
            if (i != 0) {
                newDur = releaseTimes[i] - releaseTimes[i - 1];
            }
            if (map.containsKey(keysPressed.charAt(i))) {
                int dur = map.get(keysPressed.charAt(i));
                map.put(keysPressed.charAt(i), Math.max(newDur, dur));
            } else {
                map.put(keysPressed.charAt(i), newDur);
            }
        }
        List<Map.Entry<Character, Integer>> li = new ArrayList<>(map.entrySet());
        Collections.sort(li, (o1, o2) -> {
            if (o1.getValue().compareTo(o2.getValue()) == 0)
                return o2.getKey().compareTo(o1.getKey());
            else
                return o2.getValue().compareTo(o1.getValue());
        });
        return li.get(0).getKey();
    }
}
