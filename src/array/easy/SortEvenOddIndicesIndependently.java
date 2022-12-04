package array.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEvenOddIndicesIndependently {
    public static void main(String[] args) {
        int[] nums = {36, 45, 32, 31, 15, 41, 9, 46, 36, 6, 15, 16, 33, 26, 27, 31, 44, 34};
        int[] res = sortEvenOdd(nums);

        for (int i : res)
            System.out.print(i + " ");
    }

    public static int[] sortEvenOdd(int[] nums) {
        int[] ans = new int[nums.length];
        List<Integer> odd = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                evens.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        Collections.sort(odd);
        Collections.reverse(odd);
        Collections.sort(evens);

        int index = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            ans[i] = evens.get(index++);
        }
        index = 0;
        for (int i = 1; i < nums.length; i = i + 2) {
            ans[i] = odd.get(index++);
        }
        return ans;
    }
}
