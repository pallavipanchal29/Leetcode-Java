package string.easy;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
    }

    public static String reverseOnlyLetters(String s) {
        char[] t = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetter(t[i])) i++;
            while (i < j && !Character.isLetter(t[j])) j--;
            char a = t[i];
            t[i] = t[j];
            t[j] = a;
            i++;
            j--;
        }
        return String.valueOf(t);
    }
}
