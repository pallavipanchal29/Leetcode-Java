package array.easy.hashtable;

import java.util.HashMap;

public class xOfAKind {
    public static void main(String[] args) {
        System.out.println(hasGroupsSizeX(new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2, 2}));
    }

    public static boolean hasGroupsSizeX(int[] deck) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            map.put(deck[i], map.getOrDefault(deck[i], 0) + 1);
        }
        for (int i : map.values())
            res = gcd(i, res);
        return res > 1;
    }

    public static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}
