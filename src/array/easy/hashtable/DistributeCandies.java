package array.easy.hashtable;

import java.util.HashMap;

public class DistributeCandies {
    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{6, 6, 6, 6}));
    }

    public static int distributeCandies(int[] candyType) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < candyType.length; i++)
            map.put(candyType[i], map.getOrDefault(candyType[i], 0) + 1);
        int canEat = candyType.length / 2;
        return Math.min(canEat, map.size());
    }
}
