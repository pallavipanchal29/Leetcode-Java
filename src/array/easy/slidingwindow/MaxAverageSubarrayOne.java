package array.easy.slidingwindow;

public class MaxAverageSubarrayOne {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{-1}, 1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        // sliding window
        int sum = 0;
        int count = 0;
        double maxAverage = Integer.MIN_VALUE;
        for (int left = 0, right = 0; right < nums.length; right++) {

            sum += nums[right];
            count++;

            if (k == count) {
                maxAverage = Math.max(maxAverage, (double) sum / k);
                sum -= nums[left];
                count--;
                left++;
            }
        }

        return maxAverage;
    }
}
