package string.easy.hashtable;

import java.util.HashSet;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (int i = 0; i < words.length; i++) {
            char[] temp = words[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : temp)
                sb.append(codes[c - 'a']);
            set.add(sb.toString());
        }
        return set.size();
    }
}
