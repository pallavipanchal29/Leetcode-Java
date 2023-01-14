package array.easy.hashtable;

import java.util.HashMap;

public class ElementOccuringMoreThan25PcntSorted {
    public static void main(String[] args) {
        System.out.println(findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
    }

    public static int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int result = 0;

        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

        for (int i : map.keySet()) {
            max = Math.max(max, map.get(i));
        }
        for (int i : map.keySet()) {
            if (max == map.get(i)) result = i;
        }

        return result;
    }
}
