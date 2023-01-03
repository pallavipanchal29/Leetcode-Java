package array.easy;

import java.util.Arrays;

public class FindDistanceValueTwoArrays {
    public static void main(String[] args) {
        int[] a1 = {2, 1, 100, 3};
        int[] a2 = {-5, -2, 10, -3, 7};
        System.out.println(findTheDistanceValue(a1, a2, 6));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int distance = 0;

        for (int val : arr1) {
            if (notInRange(arr2, val - d, val + d)) {
                distance++;
            }
        }

        return distance;
    }

    // Checks if the array doesn't contain any value in range (from <= value <= to) using binary search
    private static boolean notInRange(int[] arr, int from, int to) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= from && arr[mid] <= to) {
                return false;
            } else if (arr[mid] < from) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return true;
    }
}
