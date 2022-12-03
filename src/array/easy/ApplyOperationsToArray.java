package array.easy;

public class ApplyOperationsToArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 1, 0};
        int[] res = applyOperations(nums);

        for (int i : res)
            System.out.print(i + " ");
    }

    public static int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[idx++] = nums[i];
        }
        for (int i = idx; i < nums.length; i++)
            nums[i] = 0;
        return nums;
    }
}
