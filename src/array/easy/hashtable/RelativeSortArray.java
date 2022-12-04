package array.easy.hashtable;

import java.util.*;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {28, 6, 22, 8, 44, 17};
        int[] arr2 = {22, 28, 8, 6};

        int[] res = relativeSortArray(arr1, arr2);
        for (int i : res)
            System.out.print(i + " ");
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr1.length; i++)
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);

        int ind = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                int val = map.get(arr2[i]);
                while (val > 0) {
                    res[ind++] = arr2[i];
                    val--;
                }
            }
            map.remove(arr2[i]);
        }
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getKey));

        for (var entry : list) {
            int val = entry.getValue();
            while (val > 0) {
                res[ind++] = entry.getKey();
                val--;
            }
        }
        return res;
    }
}
