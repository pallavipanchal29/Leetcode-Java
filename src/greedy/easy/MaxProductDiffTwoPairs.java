package greedy.easy;

import java.util.Arrays;

public class MaxProductDiffTwoPairs {
    public static void main(String[] args) {
        System.out.println(maxProductDifference(new int[]{5, 6, 2, 7, 4}));
    }

    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return ((nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]));
    }
}
