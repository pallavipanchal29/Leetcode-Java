package array.easy.hashtable;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfArray {
    public static void main(String[] args) {
        int[] ans = arrayRankTransform(new int[]{40, 10, 20, 30});
        //10,20,30,40
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        Arrays.sort(temp);
        HashMap<Integer, Integer> rMAp = new HashMap<>();
        int idx = 0;
        for (int i : temp) {
            if (!rMAp.containsKey(i)) {
                rMAp.put(i, idx);
                idx++;
            }
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = rMAp.get(arr[i]) + 1;
        }
        return ans;
    }
}
