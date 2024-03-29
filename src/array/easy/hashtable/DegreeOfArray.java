package array.easy.hashtable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DegreeOfArray {
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
    }

    public static int findShortestSubArray(int[] nums) {
        //left : index of first occurance
        //right : index of last occurance
        Map<Integer, Integer> left = new HashMap(), right = new HashMap(), count = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null)
                left.put(x, i);
            right.put(x, i);

            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x : count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1); // calculating length
            }
        }
        return ans;
    }
}
