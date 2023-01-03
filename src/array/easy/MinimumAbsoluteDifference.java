package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        List<List<Integer>> ans = minimumAbsDifference(new int[]{4, 2, 1, 3});
        for (List<Integer> l : ans) {
            for (Integer i : l)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (diff == min)
                res.add(Arrays.asList(arr[i], arr[i + 1]));
        }

        return res;
    }
}
