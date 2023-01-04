package array.easy.math;

public class CountDigitsThatDivideNumber {
    public static void main(String[] args) {
        System.out.println(countDigits(121));
    }

    public static int countDigits(int num) {
        int count = 0;
        if (num < 10)
            return 1;
        else {
            int i = num;
            while (i != 0) {
                int t = i % 10;
                if (num % t == 0)
                    count++;
                i = i / 10;
            }
        }
        return count;
    }
}
