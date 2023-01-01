package array.easy.TwoPointers;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] ans = sortedSquares(new int[]{-4, -1, 0, 3, 10});
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static int[] sortedSquares(int[] nums) {
        int[] sortedSquares = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {

                sortedSquares[k] = nums[i] * nums[i];
                i++;
                k--;

            } else {
                sortedSquares[k] = nums[j] * nums[j];
                j--;
                k--;
            }
        }

        return sortedSquares;
    }
}
