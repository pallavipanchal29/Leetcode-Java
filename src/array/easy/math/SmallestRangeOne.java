package array.easy.math;

import java.util.Arrays;

public class SmallestRangeOne {
    public static void main(String[] args) {
        System.out.println(smallestRangeI(new int[]{0, 10}, 2));
    }

    public static int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        if (nums[0] + k >= nums[nums.length - 1] - k)
            return 0;
        return nums[nums.length - 1] - k - (nums[0] + k);
    }
}
