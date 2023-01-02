package array.easy.hashtable;

import java.util.HashSet;

public class CheckEveryrowColumnContainsAllNumbers {
    public static void main(String[] args) {
        System.out.println(checkValid(new int[][]{{1, 2, 3}, {3, 1, 2}, {2, 3, 1}}));
    }

    public static boolean checkValid(int[][] matrix) {
        for (int r = 0; r < matrix.length; ++r) {
            HashSet<Integer> row = new HashSet<>();
            HashSet<Integer> col = new HashSet<>();
            for (int c = 0; c < matrix[r].length; ++c) {
                if (!row.add(matrix[r][c]) || !col.add(matrix[c][r]))
                    return false;
            }
        }
        return true;
    }
}
