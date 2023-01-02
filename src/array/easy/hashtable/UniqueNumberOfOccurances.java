package array.easy.hashtable;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurances {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 2}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        var vals = map.values();
        HashSet<Integer> set = new HashSet<>();
        for (int i : vals)
            set.add(i);
        return map.size() == set.size();
    }
}
