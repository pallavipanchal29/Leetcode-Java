package string.easy;

public class KBeautyOfNumber {
    public static void main(String[] args) {
        System.out.println(divisorSubstrings(430043, 2));
    }

    public static int divisorSubstrings(int num, int k) {
        int c = 0;
        String n = String.valueOf(num);
        int i = 0;
        while (i < n.length()) {
            if (i + k <= n.length()) {
                String s = n.substring(i, i + k);
                int d = Integer.parseInt(s);
                if (d != 0 && num % d == 0)
                    c++;
            }
            i++;
        }
        return c;
    }
}
