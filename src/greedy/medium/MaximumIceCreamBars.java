package greedy.medium;

import java.util.Arrays;

public class MaximumIceCreamBars {
    public static void main(String[] args) {
        System.out.println(maxIceCream(new int[]{1, 3, 2, 4, 1}, 7));
    }

    public static int maxIceCream(int[] costs, int coins) {
        int count = 0;
        Arrays.sort(costs);
        int i = 0;
        while (i < costs.length && coins > 0 && coins >= costs[i]) {
            coins = coins - costs[i];
            count++;
            i++;
        }
        return count;
    }
}
