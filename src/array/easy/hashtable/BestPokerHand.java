package array.easy.hashtable;

import java.util.*;

public class BestPokerHand {
    public static void main(String[] args) {
        System.out.println(bestHand(new int[]{4, 4, 2, 4, 4}, new char[]{'d', 'a', 'a', 'b', 'c'}));
    }

    public static String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer, Integer> rMap = new HashMap<>();
        for (int i = 0; i < ranks.length; i++)
            rMap.put(ranks[i], rMap.getOrDefault(ranks[i], 0) + 1);

        HashMap<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < suits.length; i++)
            sMap.put(suits[i], sMap.getOrDefault(suits[i], 0) + 1);

        List<Map.Entry<Integer, Integer>> l1 = new ArrayList<>(rMap.entrySet());
        Collections.sort(l1, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        List<Map.Entry<Character, Integer>> l2 = new ArrayList<>(sMap.entrySet());
        Collections.sort(l2, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        for (var l : l2) {
            var en = l;
            if (en.getValue() >= 5)
                return "Flush";
        }
        for (var l : l1) {
            var en = l;
            if (en.getValue() >= 3)
                return "Three of a Kind";
            else if (en.getValue() >= 2)
                return "Pair";
        }
        return l1.size() > 0 || l2.size() > 0 ? "High Card" : null;
    }
}
