package array.easy;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] ans = decompressRLElist(new int[]{1, 2, 3, 4});
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i = i + 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            while (freq > 0) {
                ans.add(val);
                freq--;
            }
        }
        int[] res = new int[ans.size()];
        int ind = 0;
        for (int i : ans) {
            res[ind++] = i;
        }
        return res;
    }
}
