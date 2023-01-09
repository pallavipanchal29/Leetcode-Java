package array.medium.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> ans = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        for (List<Integer> l : ans) {
            for (int i : l)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int ans = 0 - nums[i];
                int low = i + 1;
                int high = nums.length - 1;
                while (low < high) {
                    if (nums[low] + nums[high] == ans) {
                        list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (nums[low] == nums[low + 1] && low < nums.length - 2)
                            low++;
                        while (nums[high] == nums[high - 1] && high > 1)
                            high--;
                        low++;
                        high--;
                    } else {
                        if (nums[low] + nums[high] > ans) {
                            high--;
                        } else low++;
                    }
                }

            }
        }
        return list;
    }
}
