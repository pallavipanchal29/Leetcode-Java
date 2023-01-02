package array.easy;

public class MinMaxGame {
    public static void main(String[] args) {
        System.out.println(minMaxGame(new int[]{1, 3, 5, 2, 4, 8, 2, 2}));
    }

    public static int minMaxGame(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return nums[0];
        while (len > 1) {
            int[] newNums = new int[len / 2];
            for (int i = 0; i < newNums.length; i++) {
                if (i % 2 == 0) {
                    newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else if (i % 2 == 1) {
                    newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            nums = newNums;
            len = nums.length;
        }
        return nums[0];
    }
}
