package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        List<Integer> ans = targetIndices(new int[]{1, 2, 5, 2, 3}, 2);
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                ans.add(i);
        }
        return ans;
    }
}
