package string.easy;

public class DecryptStringFromAlphabetIntegerMapping {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
    }

    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                StringBuilder t = new StringBuilder();
                t.append(s.charAt(i));
                t.append(s.charAt(i + 1));
                int num = Integer.parseInt(String.valueOf(t));
                char c = (char) ('a' + num - 1);
                sb.append(c);
                i = i + 3;
            } else {
                char c = (char) ('a' + Integer.parseInt(String.valueOf(s.charAt(i))) - 1);
                sb.append(c);
                i++;
            }

        }
        return sb.toString();
    }
}
