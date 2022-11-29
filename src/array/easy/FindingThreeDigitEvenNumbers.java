package array.easy;

import java.util.TreeSet;

public class FindingThreeDigitEvenNumbers {
    //Time Complexity : O(NCube)
    //Space complexity : O(N)
    public static int[] findEvenNumbers(int[] digits) {
        int N = digits.length;
        TreeSet<Integer> uniq = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            // to skip cases with leading zeroes
            if (digits[i] == 0)
                continue;
            for (int j = 0; j < N; j++) {
                // to skip cases with equal indexes
                if (i == j)
                    continue;
                for (int k = 0; k < N; k++) {
                    //to skip cases where first or second index equals third index or last digit is odd
                    if (i == k || j == k || digits[k] % 2 != 0)
                        continue;

                    uniq.add(digits[i] * 100 + digits[j] * 10 + digits[k]);
                }
            }
        }
        int[] ret = new int[uniq.size()];
        int id = 0;
        for (int i : uniq)
            ret[id++] = i;
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 0};
        int[] ans = findEvenNumbers(nums);

        for (int i : ans)
            System.out.print(i + " ");
    }
}
