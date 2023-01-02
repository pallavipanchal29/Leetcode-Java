package array.easy.hashtable;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class LuckyIntegerInArray {
    public static void main(String[] args) {
        System.out.println(findLucky(new int[]{2, 2, 3, 4}));
    }

    public static int findLucky(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == entry.getKey())
                return entry.getKey();
        }
        return -1;
    }
}
