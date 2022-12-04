package array.easy;

public class RunningSum1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = runningSum(nums);

        for (int i : ans)
            System.out.print(i + " ");
    }

    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }
}
