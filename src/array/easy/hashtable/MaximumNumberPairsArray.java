package array.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberPairsArray {
    public static void main(String[] args) {
        int[] ans = numberOfPairs(new int[]{0});
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] numberOfPairs(int[] nums) {
        int count = 0;
        int rem = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                count = count + entry.getValue() / 2;
            }
            rem = rem + entry.getValue() % 2;
        }
        return new int[]{count, rem};
    }
}
