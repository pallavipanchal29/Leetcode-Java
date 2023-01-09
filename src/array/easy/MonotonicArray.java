package array.easy;

public class MonotonicArray {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 2, 2, 3}));
    }

    public static boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return true;
        }

        boolean isIncreasing = nums[n - 1] > nums[0];
        for (int i = 1; i < n; i++) {
            if (isIncreasing) {
                if (nums[i - 1] > nums[i]) {
                    return false;
                }
            } else {
                if (nums[i - 1] < nums[i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
