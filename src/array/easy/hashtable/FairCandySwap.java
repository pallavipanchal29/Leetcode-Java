package array.easy.hashtable;

import java.util.HashSet;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] ans = fairCandySwap(new int[]{1, 1}, new int[]{2, 2});
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sa = 0, sb = 0;  // sum of A, B respectively
        for (int x : aliceSizes) sa += x;
        for (int x : bobSizes) sb += x;

//        Let Sum of choclates by Alice Be Sa and Sum of choclates by Alice Be Sb
//        Let the choclates from Alice to Bob be A and from Bob to Alice be B
//        Sa -A + B = Sb -B+A
//        2(A-B) = (Sa-Sb)
//        A-B = (Sa-Sb)/2
//        A = B+(Sa-Sb)/2
//        B = A -(Sa-Sb)/2;
//        delta(B - A) = Sb - Sa / 2;
        int delta = (sb - sa) / 2;
        // If Alice gives x, she expects to receive x + delta

        HashSet<Integer> setB = new HashSet<>();
        for (int x : bobSizes)
            setB.add(x);

        for (int x : aliceSizes)
            if (setB.contains(x + delta))
                return new int[]{x, x + delta};
        return null;
    }
}
