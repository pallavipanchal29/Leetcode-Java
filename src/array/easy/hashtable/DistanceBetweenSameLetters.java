package array.easy.hashtable;

import java.util.HashMap;

public class DistanceBetweenSameLetters {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(checkDistances("abaccb", arr));
    }

    public static boolean checkDistances(String s, int[] distance) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int d = Math.abs(map.get(s.charAt(i)) - i) - 1;
                if (d != distance[s.charAt(i) - 'a'])
                    return false;
            } else
                map.put(s.charAt(i), i);
        }
        return true;
    }
}
