package array.easy;

import java.util.ArrayList;
import java.util.List;

public class FindallNumbersDisappearedArray {
    public static void main(String[] args) {
        List<Integer> ans = findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int n = Math.abs(nums[i]) - 1;
            if (nums[n] > 0)
                nums[n] = -nums[n];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                ans.add(i + 1);
        }
        return ans;
    }
}

