package string.easy;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray {
    public static void main(String[] args) {
        List<String> ans = stringMatching(new String[]{"ga", "ugao", "dbh", "a"});
        for (String s : ans)
            System.out.print(s + " ");
    }

    public static List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[i].contains(words[j]))
                    if (!ans.contains(words[j])) ans.add(words[j]);
            }
        }
        return ans;
    }
}
