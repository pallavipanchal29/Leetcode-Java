package string.easy;

public class PercentageOfLetterInString {
    public static void main(String[] args) {
        System.out.println(percentageLetter("foobar", 'o'));
    }

    public static int percentageLetter(String s, char letter) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter)
                c++;
        }
        double a = ((double) c / s.length()) * 100;
        return (int) a;
    }
}
