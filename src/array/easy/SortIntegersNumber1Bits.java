package array.easy;

import java.util.Arrays;

public class SortIntegersNumber1Bits {
    public static void main(String[] args) {
        int[] ans = sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static int[] sortByBits(int[] arr) {
        int[][] cur = new int[arr.length][2]; //[[0,0],[1,1],[2,1],[3,2],[4,1],[5,2]]
        for (int i = 0; i < arr.length; i++) {
            cur[i][0] = arr[i];
            cur[i][1] = Integer.bitCount(arr[i]);
        }
        Arrays.sort(cur, (a, b) -> (a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cur[i][0];
        }
        return arr;
    }
}
