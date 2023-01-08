package string.easy;

import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram {
    public static void main(String[] args) {
        String[] ans = findOcurrences("we will we will rock you", "we", "will");
        for (String s : ans)
            System.out.print(s + " ");
    }

    public static String[] findOcurrences(String text, String first, String second) {
        List<String> ans = new ArrayList<>();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; ) {
            if (i + 2 < words.length && words[i].equals(first) && words[i + 1].equals(second)) {
                ans.add(words[i + 2]);
            }
            i++;
        }
        String[] res = new String[ans.size()];
        int ind = 0;
        for (String s : ans)
            res[ind++] = s;
        return res;
    }
}
