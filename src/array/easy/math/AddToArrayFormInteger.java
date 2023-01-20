package array.easy.math;

import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormInteger {
    public static void main(String[] args) {
        List<Integer> ans = addToArrayForm(new int[]{1, 2, 0, 0}, 34);
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        final LinkedList<Integer> result = new LinkedList<>();
        int len = num.length - 1;

        while (len >= 0 || k != 0) {

            if (len >= 0) {
                k += num[len--];
            }

            result.addFirst(k % 10); // adding last digit
            k /= 10; // getting remainder
        }

        return result;
    }
}
