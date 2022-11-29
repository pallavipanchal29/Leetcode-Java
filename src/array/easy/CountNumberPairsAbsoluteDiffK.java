package array.easy;

public class CountNumberPairsAbsoluteDiffK
{
    public static int countKDifference(int[] nums, int k)
    {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j && Math.abs(nums[i] - nums[j]) == k)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] nums = {1,2,2,1};
        System.out.println(countKDifference(nums,1));
    }
}
