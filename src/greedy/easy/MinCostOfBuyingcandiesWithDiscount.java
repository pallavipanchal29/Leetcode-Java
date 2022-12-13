package greedy.easy;

import java.util.Arrays;

public class MinCostOfBuyingcandiesWithDiscount {
    public static void main(String[] args) {
        System.out.println(minimumCost(new int[]{3, 3, 3, 1}));
    }

    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res = 0, n = cost.length;
        for (int i = 0; i < n; ++i) {
            if (i % 3 != n % 3)
                res += cost[i];
        }
        return res;
    }
}
