package array.easy;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingElements {
    public static void main(String[] args) {
        System.out.println(trimMean(new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}));
    }

    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int c = (int) (arr.length * 0.05);
        int i = c;
        int j = arr.length - c - 1;
        int n = arr.length - (2 * c);
        int sum = 0;
        while (i <= j) {
            sum = sum + arr[i];
            i++;
        }
        return (double) sum / n;
    }
}
