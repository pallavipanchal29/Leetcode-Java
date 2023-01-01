package array.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[]{1, 2, 3, 2}));
    }

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                sum = sum + entry.getKey();
        }
        return sum;
    }
}
