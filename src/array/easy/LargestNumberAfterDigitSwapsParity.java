package array.easy;

public class LargestNumberAfterDigitSwapsParity {
    public static void main(String[] args) {
        System.out.println(largestInteger(1234));
    }

    //Brute force
    public static int largestInteger(int num) {
        char[] a = String.valueOf(num).toCharArray();
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[j] > a[i] && (a[j] - a[i]) % 2 == 0) {
                    char t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
        return Integer.parseInt(new String(a));
    }
}
