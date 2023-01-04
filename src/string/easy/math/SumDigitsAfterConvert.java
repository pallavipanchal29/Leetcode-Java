package string.easy.math;

public class SumDigitsAfterConvert {
    public static void main(String[] args) {
        System.out.println(getLucky("leetcode", 2));
    }

    public static int getLucky(String s, int k) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a' + 1;
            sum = sum + getSumDigits(val);
        }
        int num = sum;
        while (k > 1) {
            int total = 0;
            int n = num;
            while (n != 0) {
                int t = n % 10;
                total = total + t;
                n = n / 10;
            }
            k--;
            if (k == 1)
                return total;
            else num = total;

        }
        return sum;
    }

    private static int getSumDigits(int val) {
        int sum = 0;
        while (val != 0) {
            int t = val % 10;
            sum = sum + t;
            val = val / 10;
        }
        return sum;
    }
}
