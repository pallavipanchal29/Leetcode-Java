package array.easy;

import java.util.HashMap;
import java.util.Iterator;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] ans = intersection(nums1, nums2);
        for (int i : ans)
            System.out.print(i + " ");

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i : nums1)
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i : nums2)
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        var keys1 = map1.keySet();
        var keys2 = map2.keySet();
        keys1.retainAll(keys2);
        Iterator<Integer> it1 = keys1.iterator();
        int[] ans = new int[keys1.size()];
        int ind = 0;
        while (it1.hasNext())
            ans[ind++] = it1.next();
        return ans;
    }
}
