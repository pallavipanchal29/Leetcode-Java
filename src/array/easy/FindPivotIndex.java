package array.easy;

public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum = sum + nums[i];

        int leftsum = 0;
        int rightSum = sum;

        for (int i = 0; i < nums.length; i++) {
            rightSum = rightSum - nums[i];
            if (rightSum == leftsum)
                return i;
            leftsum = leftsum + nums[i];
        }
        return -1;
    }

}
