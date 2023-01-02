package array.easy.hashtable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MergeSimilarItems {
    public static void main(String[] args) {
        int[][] l1 = {{1, 1}, {4, 5}, {3, 8}};
        int[][] l2 = {{3, 1}, {1, 5}};
        List<List<Integer>> ans = mergeSimilarItems(l1, l2);
        for (List<Integer> l : ans) {
            for (int i : l)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        FillMap(items1, map);
        FillMap(items2, map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> t = new ArrayList<>();
            t.add(entry.getKey());
            t.add(entry.getValue());
            ans.add(t);
        }
        return ans;
    }

    private static void FillMap(int[][] items, TreeMap<Integer, Integer> map) {
        for (int i = 0; i < items.length; i++) {
            int item = items[i][0];
            if (map.containsKey(item)) {
                int w = map.get(item) + items[i][1];
                map.put(item, w);
            } else {
                map.put(item, items[i][1]);
            }
        }
    }
}
