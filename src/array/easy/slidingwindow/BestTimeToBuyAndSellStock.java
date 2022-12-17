package array.easy.slidingwindow;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max = Integer.MIN_VALUE;

        while (r < prices.length) {
            if (prices[r] < prices[l])
                l = r;
            else
                max = Math.max(max, prices[r] - prices[l]);
            r++;
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
