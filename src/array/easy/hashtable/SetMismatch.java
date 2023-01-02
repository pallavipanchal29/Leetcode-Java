package array.easy.hashtable;

import java.util.HashSet;

public class SetMismatch {
    public static void main(String[] args) {
        int[] ans = findErrorNums(new int[]{1, 2, 2, 4});
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        int expected = (n * (n + 1)) / 2;

        int actual = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                ans[0] = nums[i];
            else {
                set.add(nums[i]);
                actual = actual + nums[i];
            }
        }
        ans[1] = Math.abs(expected - actual);
        return ans;
    }
}
