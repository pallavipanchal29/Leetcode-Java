package array.easy.math;

public class CountIntegersEvenDigitSum {
    public static void main(String[] args) {
        System.out.println(countEven(30));
    }

    public static int countEven(int num) {
        int count = 0;
        if (num <= 10)
            return num / 2;
        else {
            count = count + 4;
            for (int i = 11; i <= num; i++) {
                int sum = getSumDigits(i);
                if (sum % 2 == 0)
                    count++;
            }
        }
        return count;
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
