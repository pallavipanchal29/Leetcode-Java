package array.easy.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateTwo {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1};
        System.out.println(containsNearbyDuplicate(arr, 1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k)
                set.remove(nums[i - k - 1]);

            if (!set.add(nums[i]))
                return true;
        }

        return false;
    }
}
