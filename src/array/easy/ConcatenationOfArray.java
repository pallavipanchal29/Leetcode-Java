package array.easy;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] res = getConcatenation(nums);

        for (int i : res)
            System.out.print(i + " ");
    }

    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        int i = 0;
        int j = nums.length;
        int index = 0;
        while (i < nums.length) {
            res[i] = res[j] = nums[index++];

            i++;
            j++;
        }
        return res;
    }
}
