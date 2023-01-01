package array.easy.hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAverages {
    public static void main(String[] args) {
        System.out.println(distinctAverages(new int[]{9, 5, 7, 8, 7, 9, 8, 2, 0, 7}));
    }

    public static int distinctAverages(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0, n = nums.length; i < n / 2; ++i) {
            seen.add(nums[i] + nums[n - 1 - i]);
        }
        return seen.size();
    }
}
