package string.easy.hashtable;

import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("a, a, a, a, b,b,b,c, c", new String[]{"a"}));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        List<String> bannedList = new ArrayList<>();
        for (String s : banned)
            bannedList.add(s);
        // check corner case
        if (paragraph.length() == 0) return "";
        // make all lower case
        paragraph = paragraph.toLowerCase();
        // remove unnecessary characters
        String noAlphabet = "'!,.;:?";
        // replace all character to empty string
        for (char c : noAlphabet.toCharArray()) {
            paragraph = paragraph.replace(c, ' ');
        }
        // split string for create map
        String[] words = paragraph.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!bannedList.contains(words[i]))
                map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        List<Map.Entry<String, Integer>> li = new ArrayList<>(map.entrySet());
        Collections.sort(li, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        return li.get(0).getKey();
    }
}
