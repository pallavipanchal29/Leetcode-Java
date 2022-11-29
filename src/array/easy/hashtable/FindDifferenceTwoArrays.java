package array.easy.hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class FindDifferenceTwoArrays {
    //Time Complexity : O(N) + O(N) => O(N)
    //Space complexity : O(N) + O(N) => O(N)
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

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

        for (int i = 0; i < nums1.length; i++) {
            if (!result.contains(nums1[i]))
                if (!arr1.contains(nums1[i])) arr1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (!result.contains(nums2[i]))
                if (!arr2.contains(nums2[i])) arr2.add(nums2[i]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(arr1);
        ans.add(arr2);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3};
        int[] arr2 = {1, 1, 2, 2};
        List<List<Integer>> ans = findDifference(arr1, arr2);

        for (var i : ans) {
            List<Integer> temp = i;
            System.out.print(temp.get(0) + " " + temp.get(1));
        }
    }
}
