package string.easy;

public class NumberOfLinesWriteString {
    //incomplete
    public static void main(String[] args) {
        int[] w = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] ans = numberOfLines(w, "abcdefghijklmnopqrstuvwxyz");

        for (int i : ans)
            System.out.print(i + " ");
    }

    public static int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int len = 0;
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            int w = widths[s.charAt(i) - 'a'];
            if (len <= 100 && len + w <= 100) {
                len = len + w;
                sb.append(s.charAt(i));
            } else {
                lines++;
                len = len + w >= 100 ? 0 : len;
                System.out.println(sb);
                sb = new StringBuilder();
                i--;
            }
            i++;
        }
        return new int[]{lines, len};
    }
}
