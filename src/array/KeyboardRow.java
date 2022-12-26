package array;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] ans = findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        for (String s : ans)
            System.out.print(s + " ");
    }

    public static String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String l = String.valueOf(word.charAt(0)).toLowerCase();
            String row = first.contains(l) ? first : (second.contains(l) ? second : third);
            boolean isValid = true;
            for (int j = 1; j < word.length(); j++) {
                if (!row.contains(String.valueOf(word.charAt(j)).toLowerCase())) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) ans.add(word);
        }
        String[] res = new String[ans.size()];
        int ind = 0;
        for (String s : ans)
            res[ind++] = s;
        return res;
    }
}
