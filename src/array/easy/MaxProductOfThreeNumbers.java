package array.easy;

import java.util.Arrays;

public class MaxProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(maximumProduct(arr));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}
