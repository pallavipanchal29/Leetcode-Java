package array.easy;

public class CountEqualDivisiblePairsArray {
    //Time Complexity : O(N square)
    //Space complexity : Constant
    public static int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j && ((i * j) % k == 0))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 2, 2, 1, 3};
        System.out.println(countPairs(nums, 2));
    }
}
