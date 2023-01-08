package string.easy.hashtable;

import java.util.HashMap;

public class MaxNumberOfBalloons {
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
    }

    public static int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++)
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);

        int count = 0;
        int i = 0;
        String str = "balloon";
        while (map.size() > 0) {
            while (i < str.length()) {
                if (map.containsKey(str.charAt(i))) {
                    if (map.get(str.charAt(i)) == 1)
                        map.remove(str.charAt(i));
                    else
                        map.put(str.charAt(i), map.get(str.charAt(i)) - 1);
                    i++;
                } else {
                    return count;
                }
            }
            if (i == str.length()) count++;
            i = 0;
        }
        return count;
    }
}
