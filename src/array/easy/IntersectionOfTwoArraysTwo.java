package array.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysTwo {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] ans = intersect(nums1, nums2);
        for (int i : ans)
            System.out.print(i + " ");

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i : nums1)
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i : nums2)
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        List<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                int val = Math.min(entry.getValue(), map2.get(entry.getKey()));
                while (val > 0) {
                    ans.add(entry.getKey());
                    val--;
                }
            }
        }
        int[] res = new int[ans.size()];
        int ind = 0;
        for (int i : ans)
            res[ind++] = i;
        return res;
    }

}
