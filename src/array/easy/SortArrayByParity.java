package array.easy;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] res = sortArrayByParity(nums);

        for (int i : res)
            System.out.print(i + " ");
    }

    public static int[] sortArrayByParity(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                nums[i] = nums[i] * -1;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                nums[i] = nums[i] * -1;
        }
        return nums;
    }
}
