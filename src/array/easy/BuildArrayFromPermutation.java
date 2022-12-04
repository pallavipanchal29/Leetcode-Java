package array.easy;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] res = buildArray(nums);

        for (int i : res)
            System.out.print(i + " ");
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

