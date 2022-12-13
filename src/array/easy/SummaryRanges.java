package array.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        List<String> ans = summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        for (String s : ans)
            System.out.print(s + " ");
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; ) {
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            int j = i + 1;
            while (j < nums.length) {
                if (nums[j] - nums[j - 1] == 1) {
                    j++;
                } else
                    break;
            }
            if (i != j - 1)
                sb.append("->" + nums[j - 1]);
            i = j;
            ans.add(sb.toString());
        }
        return ans;
    }
}
