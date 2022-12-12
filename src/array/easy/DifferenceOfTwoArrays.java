package array.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        List<List<Integer>> ans = findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6});
        for (List<Integer> l : ans) {
            for (int i : l)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums1)
            set1.add(i);
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums2)
            set2.add(i);
        List<Integer> l1 = new ArrayList<>();
        Iterator<Integer> it1 = set1.iterator();
        while (it1.hasNext()) {
            int el = it1.next();
            if (!set2.contains(el))
                l1.add(el);
        }
        List<Integer> l2 = new ArrayList<>();
        Iterator<Integer> it2 = set2.iterator();
        while (it2.hasNext()) {
            int el = it2.next();
            if (!set1.contains(el))
                l2.add(el);
        }
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}
