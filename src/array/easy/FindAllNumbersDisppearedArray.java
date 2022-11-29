package array.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisppearedArray {
    //Time Complexity : O(N)+O(N) => O(N)
    //Space complexity : constant
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0)
                nums[val] = -nums[val];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                ans.add(i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = findDisappearedNumbers(nums);

        for (int i : ans)
            System.out.print(i + " ");
    }
}
