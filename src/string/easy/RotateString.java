package string.easy;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }

    public static boolean rotateString(String s, String goal) {
        if (goal.length() != s.length()) return false;
        return s.concat(s).contains(goal);
    }
}
