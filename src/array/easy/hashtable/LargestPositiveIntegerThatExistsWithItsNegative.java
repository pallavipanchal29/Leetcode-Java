package array.easy.hashtable;

import java.util.Arrays;
import java.util.HashSet;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    //Time Complexity : O(N) + O(N) + O(NLogN) => O(NLogN)
    //Space complexity : O(N)
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            //Checking the largest numbers from the last index as the array is sorted
            if (set.contains(-nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, -3, 3};
        System.out.println(findMaxK(nums));
    }
}
