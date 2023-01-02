package array.easy.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TwoOutOfThree {
    public static void main(String[] args) {
        List<Integer> ans = twoOutOfThree(new int[]{1, 1, 3, 2}, new int[]{2, 3}, new int[]{3});
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> ans = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i]))
                map.put(nums1[i], 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) != 2)
                ans.add(nums2[i]);
            else
                map.put(nums2[i], 2);
        }
        for (int i = 0; i < nums3.length; i++) {
            if (map.containsKey(nums3[i]) && map.get(nums3[i]) != 3)
                ans.add(nums3[i]);
            else
                map.put(nums3[i], 3);
        }
        List<Integer> res = new ArrayList<>();
        for (int i : ans)
            res.add(i);
        return res;
    }
}
