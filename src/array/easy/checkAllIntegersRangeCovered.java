package array.easy;

import java.util.Arrays;
import java.util.Comparator;

public class checkAllIntegersRangeCovered {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(isCovered(arr, 2, 5));
    }

    public static boolean isCovered(int[][] ranges, int left, int right) {
        Arrays.sort(ranges, Comparator.comparingInt(a -> a[0]));
        for (int[] i : ranges) {
            if (left >= i[0] && left <= i[1])
                left = i[1] + 1; //if it falls then move left outside end
        }
        return left > right;
    }
}
