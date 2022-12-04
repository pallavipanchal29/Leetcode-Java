package array.easy;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ind = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                ind = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && nums[i] * 2 > max)
                return -1;
        }
        return ind;
    }
}
