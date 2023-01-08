package string.easy;

public class ReplaceQuestionsMarksAvoidRepeatingChars {
    public static void main(String[] args) {
        System.out.println(modifyString("j?qg??b"));
    }

    public static String modifyString(String s) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        char prev = ' ';
        char next = ' ';

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                prev = i != 0 ? s.charAt(i - 1) : ' ';
                next = i != s.length() - 1 ? s.charAt(i + 1) : ' ';
                int m = 0;
                while (m < letters.length()) {
                    char ch = letters.charAt(m);
                    if (ch != prev && ch != next && (i == 0 || ch != sb.toString().charAt(i - 1))) {
                        sb.append(ch);
                        break;
                    }
                    m++;
                }
            } else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
