package array.math;

public class AverageValueEvenNumbersDivisibleByThree {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 10, 12, 15};
        System.out.println(averageValue(nums));
    }

    public static int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 6 == 0) {
                sum = sum + nums[i];
                count++;
            }
        }
        return count > 0 ? Math.round(sum / count) : 0;
    }
}
