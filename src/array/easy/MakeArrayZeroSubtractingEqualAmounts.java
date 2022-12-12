package array.easy;

public class MakeArrayZeroSubtractingEqualAmounts {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1, 5, 0, 3, 5}));
    }

    public static int minimumOperations(int[] nums) {
        int count = 0;
        while (!checkIfAllZeroes(nums)) {
            int minValue = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= 0) {
                    continue;
                }
                minValue = Math.min(minValue, nums[i]);
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= 0) {
                    continue;
                }
                nums[i] = nums[i] - minValue;
            }
            count++;
        }
        return count;
    }

    public static boolean checkIfAllZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
