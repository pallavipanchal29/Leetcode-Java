package array.easy;

public class FindMiddleIndexArray {
    public static void main(String[] args) {
        System.out.println(findMiddleIndex(new int[]{2, 3, -1, 8, 4}));
    }

    public static int findMiddleIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum = sum + nums[i];

        int leftSum = 0;
        int rightSum = sum;
        for (int i = 0; i < nums.length; i++) {
            rightSum = rightSum - nums[i];
            if (rightSum == leftSum)
                return i;
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
}
