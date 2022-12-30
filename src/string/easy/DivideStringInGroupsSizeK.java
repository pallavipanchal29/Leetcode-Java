package string.easy;

import java.util.ArrayList;
import java.util.List;

public class DivideStringInGroupsSizeK {
    public static void main(String[] args) {
        String[] ans = divideString("abcdefghij", 3, 'x');
        for (String s : ans)
            System.out.print(s + " ");
    }

    public static String[] divideString(String s, int k, char fill) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < s.length(); ) {
            String t = s.substring(i, Math.min(i + k, s.length()));
            if (t.length() < k) {
                int len = t.length();
                while (len < k) {
                    t = t.concat(String.valueOf(fill));
                    len++;
                }
            }
            ans.add(t);
            i = i + k;
        }
        String[] res = new String[ans.size()];
        int ind = 0;
        for (String sr : ans)
            res[ind++] = sr;
        return res;
    }
}
