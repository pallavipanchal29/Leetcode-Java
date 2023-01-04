package array.easy.math;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(1111111));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        do {
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            int num = n;
            while (num != 0) {
                int t = num % 10;
                sum = sum + (t * t);
                num = num / 10;
            }
            sb.append(sum);
            int newNum = Integer.parseInt(sb.toString());
            n = newNum;
            if (!set.add(n))
                break;
        } while (n > 0);
        return n == 1;
    }
}
