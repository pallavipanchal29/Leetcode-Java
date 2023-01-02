package array.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class CheckArrayFormationThroughConcatenation {
    public static void main(String[] args) {
        System.out.println(canFormArray(new int[]{15, 88}, new int[][]{{88}, {15}}));
    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> anchor = new HashMap<>();

        //<anchorKey, BucketID>
        for (int p = 0; p < pieces.length; p++) {
            anchor.put(pieces[p][0], p);
        }

        for (int i = 0; i < arr.length; ) {
            Integer index = anchor.get(arr[i++]);
            if (index == null || pieces[index] == null) {
                return false;
            }
            int[] vals = pieces[index];
            for (int v = 1; v < vals.length; v++) {
                if (vals[v] != arr[i++]) return false;
            }
        }
        return true;
    }
}
