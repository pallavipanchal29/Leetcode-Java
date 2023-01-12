package array.easy;

import java.util.Arrays;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{1, 2}, 1));
    }

    public static int findKthPositive(int[] arr, int k) {
        int count = 0;
        int num = 1;
        while (count < k) {
            if (Arrays.binarySearch(arr, num) < 0)
                count++;
            if (count == k) return num;
            else num++;
        }
        return num;
    }

}
