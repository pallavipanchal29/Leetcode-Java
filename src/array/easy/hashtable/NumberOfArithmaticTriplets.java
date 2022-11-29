package array.easy.hashtable;

import java.util.HashMap;

public class NumberOfArithmaticTriplets {
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        System.out.println(arithmeticTriplets(nums, 3));
    }

    //Time Complexity : O(N)
    //Space complexity : O(N)
    public static int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int ct = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hm.put(nums[i], 1);
        }

        for (int i = 0; i < n; i++) {

            if (hm.containsKey(nums[i] + diff) && hm.containsKey(nums[i] + 2 * diff)) {
                ct++;
            }
        }

        return ct;
    }
}
