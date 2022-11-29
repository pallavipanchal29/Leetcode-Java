package array.easy.hashtable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class IntersectionOfMultipleArrays {
    //Time Complexity : O(N) + O(N) => O(N)
    //Space complexity : O(N) + O(N) => O(N)
    public static List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        TreeMap<Integer, Integer> map = new TreeMap();
        for (int i = 0; i < nums.length; i++) {
            {
                for (int j = 0; j < nums[i].length; j++) {
                    map.put(nums[i][j], map.getOrDefault(nums[i][j], 0) + 1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == n)
                ans.add(entry.getKey());
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] nums = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        List<Integer> ans = intersection(nums);
        for (int i : ans)
            System.out.print(i + " ");
    }
}
