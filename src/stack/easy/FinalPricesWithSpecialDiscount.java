package stack.easy;

import java.util.Stack;

public class FinalPricesWithSpecialDiscount {
    public static void main(String[] args) {
        int[] ans = finalPrices(new int[]{8, 4, 6, 2, 3});
        for (int i : ans)
            System.out.print(i + " ");

    }

    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        for (int i = prices.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }

            int price = prices[i];
            if (!stack.isEmpty()) {
                prices[i] = prices[i] - stack.peek();
            }
            stack.push(price);
        }
        return prices;
    }
}
