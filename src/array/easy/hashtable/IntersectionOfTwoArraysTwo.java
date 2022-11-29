package array.easy.hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class IntersectionOfTwoArraysTwo {
    //Time Complexity : O(N) + O(N) => O(N)
    //Space complexity : O(N) + O(N) => O(N)
    public static int[] intersect(int[] nums1, int[] nums2) {
        TreeMap<Integer, Integer> map1 = new TreeMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }
        TreeMap<Integer, Integer> map2 = new TreeMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
        }

        HashSet<Integer> result = new HashSet(map1.keySet());
        result.retainAll(map2.keySet());

        List<Integer> res = new ArrayList<>();
        for (int i : result) {
            int val = Math.min(map1.get(i), map2.get(i));
            while (val > 0) {
                res.add(i);
                val--;
            }
        }
        int[] ans = new int[res.size()];
        int idx = 0;
        for (int i : res) {
            ans[idx++] = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] ans = intersect(nums1, nums2);
        for (int i : ans)
            System.out.print(i + " ");
    }
}
