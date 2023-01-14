package string.easy;

public class IfAllAsAppearBeforeBs {
    public static void main(String[] args) {
        System.out.println(checkString("aaabbb"));
    }

    public static boolean checkString(String s) {
        int indB = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                if (i > indB) return false;
            } else if (s.charAt(i) == 'b') {
                indB = Math.min(indB, i);
            }
        }
        return true;
    }
}
