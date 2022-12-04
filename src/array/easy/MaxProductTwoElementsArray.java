package array.easy;

public class MaxProductTwoElementsArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j)
                    max = Math.max(max, ((nums[i] - 1) * (nums[j] - 1)));
            }
        }
        return max;
    }
}
