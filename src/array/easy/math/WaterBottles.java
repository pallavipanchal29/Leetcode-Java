package array.easy.math;

public class WaterBottles {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int empty = ans;
        int rem = 0;
        while (empty / numExchange >= 1) {
            numBottles = empty / numExchange;
            rem = empty % numExchange;
            ans = ans + numBottles;
            empty = rem + numBottles;
        }
        return ans;
    }
}
