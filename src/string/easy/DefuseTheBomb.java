package string.easy;

import java.util.Arrays;

public class DefuseTheBomb {
    public static void main(String[] args) {
        int[] ans = decrypt(new int[]{5, 7, 1, 4}, 3);
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static int[] decrypt(int[] code, int k) {
        var n = code.length;
        return k > 0 ? decrypt(code, new int[n], k, 1, k + 1) : decrypt(code, new int[n], k, n + k, n);
    }

    // [left, right)
    private static int[] decrypt(int[] code, int[] decode, int k, int left, int right) {
        if (k == 0)
            return decode;

        var sum = decode[0] = Arrays.stream(code, left, right).sum();

        for (int i = 1, n = decode.length; i < n; i++, left++, right++)
            decode[i] = sum += code[right % n] - code[left % n];

        return decode;
    }
}
