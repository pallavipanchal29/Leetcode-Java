package string.easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashMap<Character, Integer> sMAp = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            sMAp.put(stones.charAt(i), sMAp.getOrDefault(stones.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : sMAp.entrySet()) {
            if (jewels.contains(String.valueOf(entry.getKey())))
                count = count + entry.getValue();
        }
        return count;
    }
}
