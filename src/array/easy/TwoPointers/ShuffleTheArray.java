package array.easy.TwoPointers;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] res = ShuffleBruteForce(nums, 3);

        for (int i : res)
            System.out.print(i + " ");
    }

    public static int[] ShuffleBruteForce(int[] nums, int n) {
        int[] res = new int[nums.length];
        int index = 0;
        int p1 = 0;
        int p2 = n;
        while (index < nums.length) {
            res[index++] = nums[p1];
            res[index++] = nums[p2];
            p1++;
            p2++;
        }
        return res;
    }

    public static int[] shuffleConstantSpace(int[] nums, int n) {
        int len = nums.length;

        // to store the pair of numbers in right half of the original array
        for (int i = n; i < len; i++) {
            nums[i] = (nums[i] * 1024) + nums[i - n]; //adds number from left half
        }

        int index = 0;
        // to retrive values from the pair of numbers and placing those retrieved value at their desired position
        for (int i = n; i < len; i++, index += 2) {
            nums[index] = nums[i] % 1024; // gets added number back in first step as remainder
            nums[index + 1] = nums[i] / 1024; // gets number transformed back as quotient
        }

        return nums;
    }

    //Solution 3
    public static int[] shuffleBitwise(int[] nums, int n) {
        int i = n - 1;
        for (int j = nums.length - 1; j >= n; j--) {
            nums[j] <<= 10;
            nums[j] |= nums[i];
            i--;
        }

        i = 0;
        for (int j = n; j < nums.length; j++) {
            int num1 = nums[j] & 1023;
            int num2 = nums[j] >> 10;
            nums[i] = num1;
            nums[i + 1] = num2;
            i += 2;
        }
        return nums;
    }
}
