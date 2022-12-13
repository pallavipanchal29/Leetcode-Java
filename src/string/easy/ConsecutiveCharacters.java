package string.easy;

public class ConsecutiveCharacters {
    public static void main(String[] args) {
        System.out.println(maxPower("abbcccddddeeeeedcba"));
    }

    public static int maxPower(String s) {
        int max = Integer.MIN_VALUE;
        int len = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                len++;
            } else {
                max = Math.max(max, len);
                len = 1;
            }
        }
        return Math.max(max, len);
    }

}
