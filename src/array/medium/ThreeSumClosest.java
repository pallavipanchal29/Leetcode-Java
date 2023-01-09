package array.medium;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int relDist = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = first + nums[start] + nums[end];

                if (Math.abs(target - sum) < relDist) {
                    relDist = Math.abs(target - sum);
                    ans = sum;
                }

                if (sum > target) {
                    end--;
                } else if (sum < target) {
                    start++;
                } else {
                    break;
                }
            }
        }

        return ans;
    }
}
