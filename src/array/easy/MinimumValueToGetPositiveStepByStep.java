package array.easy;

import java.util.Arrays;

public class MinimumValueToGetPositiveStepByStep {
    public static void main(String[] args) {
        int[] nums = {2, 3};
        System.out.println(minStartValue(nums));
    }

    public static int minStartValue(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        Arrays.sort(nums);
        if (nums[0] > 0)
            return 1;// first value of array after sorting is positive that means all array values  are positive i.e sum is always positive so minimum positive value is 1
        else
            return Math.abs(nums[0]) + 1; // otherwise add one to absolute value of sum so that ultimate result is at least one
    }
}
