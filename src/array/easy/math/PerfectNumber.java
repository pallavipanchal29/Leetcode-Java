package array.easy.math;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }

    public static boolean checkPerfectNumber(int num) {
        if (num < 2) return false;
        int sum = 1;
        for (int x = 2; x * x <= num; x++) {
            if (num % x == 0) {
                sum += x;
                sum += num / x;
            }
        }

        return sum == num;
    }
}
