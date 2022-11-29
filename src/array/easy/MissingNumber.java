package array.easy;

public class MissingNumber {
    //Time Complexity : O(N)
    //Space complexity : constant
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = (n * (n + 1)) / 2;
        int actual = 0;

        for (int i = 0; i < nums.length; i++)
            actual = actual + nums[i];

        return Math.abs(expected - actual);
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }
}
