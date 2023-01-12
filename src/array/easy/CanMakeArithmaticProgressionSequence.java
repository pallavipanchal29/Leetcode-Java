package array.easy;

import java.util.Arrays;

public class CanMakeArithmaticProgressionSequence {
    public static void main(String[] args) {
        System.out.println(canMakeArithmeticProgression(new int[]{3, 5, 1}));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = -1;
        for (int i = 1; i < arr.length; i++) {
            if (diff == -1)
                diff = arr[i] - arr[i - 1];
            else if (arr[i] - arr[i - 1] != diff)
                return false;
        }
        return true;
    }
}
