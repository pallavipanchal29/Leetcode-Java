package array.easy;

public class FindNumbersEvenNumberOfDigits {
    //Time Complexity : O(N)
    //Space complexity : constant
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int ct = 0;
            int n = nums[i];
            while (n != 0) {
                int t = n % 10;
                ct++;
                n = n / 10;
            }
            if (ct % 2 == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}
