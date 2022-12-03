package array.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberCandies {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 1, 3};
        List<Boolean> ans = kidsWithCandies(nums, 3);

        for (Boolean i : ans)
            System.out.print(i + " ");
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++)
            max = Math.max(max, candies[i]);

        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}
