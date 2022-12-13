package array.easy.slidingwindow;

import java.util.Arrays;

public class MinDiffBetweenHighestLowestKScores {
    public static void main(String[] args) {
        System.out.println(minimumDifference(new int[]{9, 4, 1, 7}, 2));
    }

    public static int minimumDifference(int[] nums, int k) {
        if (nums.length == 1) return 0;

        int minScore = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - k; i++) {
            minScore = Math.min(minScore, nums[i + k - 1] - nums[i]);
        }
        return minScore;
    }

}
