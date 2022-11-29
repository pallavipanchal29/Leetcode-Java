package array.easy.hashtable;

import java.util.HashSet;
import java.util.Set;

public class SubarraysWithEqualSum {
    //Time Complexity : O(N)
    //Space complexity : O(constant)
    public static boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i < nums.length; i++) {
            // Added first time no issue
            // Added second time return true as only two subarrays are required
            if (!set.add(nums[i] + nums[i - 1]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 4};
        System.out.println(findSubarrays(nums));
    }
}
