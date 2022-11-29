package array.easy;

import java.util.ArrayList;
import java.util.List;

public class FindKDistantIndices {
    //Time Complexity : O(N square)
    //Space complexity : Constant
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (Math.abs(i - j) <= k && nums[j] == key) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 2};
        List<Integer> ans = findKDistantIndices(nums, 2, 2);

        for (int i : ans)
            System.out.print(i + " ");
    }
}
