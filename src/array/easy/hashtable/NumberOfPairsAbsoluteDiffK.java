package array.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class NumberOfPairsAbsoluteDiffK {
    public static void main(String[] args) {
        System.out.println(countKDifference(new int[]{1, 2, 2, 1}, 1));
    }

    public static int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] - k)) {
                res += map.get(nums[i] - k);
            }
            if (map.containsKey(nums[i] + k)) {
                res += map.get(nums[i] + k);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return res;
    }
}
