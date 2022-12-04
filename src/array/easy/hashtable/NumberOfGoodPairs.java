package array.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, 1 + map.getOrDefault(n, 0));
        }
        int sum = 0;
        for (int n : map.values()) {
            sum += n * (n - 1) / 2;
        }
        return sum;
    }
}
