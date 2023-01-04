package array.easy.math;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(10));
    }

    public static int addDigits(int num) {
        if (num < 10) return num;
        while (num >= 10) {
            int n = num;
            int sum = 0;
            while (n != 0) {
                int t = n % 10;
                sum = sum + t;
                n = n / 10;
            }
            if (sum < 10)
                return sum;
            else
                num = sum;
        }
        return num;
    }
}
