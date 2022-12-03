package array.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class DivideArrayEqualPairs {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2, 2, 2};
        System.out.println(divideArray(nums));
    }

    public static boolean divideArray(int[] nums) {
        if (nums.length % 2 == 1) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) return false;
        }
        return true;
    }
}
