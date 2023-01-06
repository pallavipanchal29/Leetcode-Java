package string.easy;

import java.util.ArrayList;
import java.util.List;

public class RearrangeSpacesBetweenWords {
    public static void main(String[] args) {
        System.out.println(reorderSpaces("hello   world"));
    }

    public static String reorderSpaces(String text) {
        int spaces = 0;
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isSpaceChar(text.charAt(i))) {
                spaces++;
                if (word.length() > 0) {
                    words.add(word.toString());
                    word = new StringBuilder();
                }
            } else {
                word.append(text.charAt(i));
            }
        }
        if (word.length() > 0)
            words.add(word.toString());

        StringBuilder ans = new StringBuilder();
        int rearr = 0;
        if (words.size() >= 2) {
            rearr = spaces / (words.size() - 1);
        }
        int ind = 0;
        while (ind < words.size()) {
            ans.append(words.get(ind));
            int i = 0;
            while (i < rearr && spaces > 0) {
                ans.append(" ");
                i++;
                spaces--;
            }
            ind++;
        }
        if (spaces > 0) {
            while (spaces > 0) {
                ans.append(" ");
                spaces--;
            }
        }
        return ans.toString();
    }
}
