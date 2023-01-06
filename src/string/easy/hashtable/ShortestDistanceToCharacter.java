package string.easy.hashtable;

import java.util.TreeSet;

public class ShortestDistanceToCharacter {
    public static void main(String[] args) {
        int[] ans = shortestToChar("loveleetcode", 'e');
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static int[] shortestToChar(String S, char C) {
        TreeSet<Integer> set = new TreeSet<>();

        //add all indexes of C into tree set
        for (int i = 0; i < S.length(); i++)
            if (S.charAt(i) == C)
                set.add(i);

        int[] result = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            if (!set.contains(i)) {
                Integer left = set.floor(i);
                Integer right = set.ceiling(i);

                if (left == null)
                    left = Integer.MAX_VALUE;
                if (right == null)
                    right = Integer.MAX_VALUE;

                result[i] = Math.min(Math.abs(left - i), Math.abs(right - i));
            } else {
                result[i] = 0;
            }
        }
        return result;
    }
}
