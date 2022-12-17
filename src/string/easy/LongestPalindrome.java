package string.easy;

import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        //Have a map of char to count
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        //Get the counts list of the map
        for (char c : s.toCharArray()) {
            int count = charCountMap.getOrDefault(c, 0);
            charCountMap.put(c, count + 1);
        }

        //Pick elements. We can pick max 1 odd count element (the middle one)
        int total = 0;
        boolean isOddPicked = false;
        for (int count : charCountMap.values()) {
            if (count % 2 == 0) {
                total += count;
            } else {
                if (!isOddPicked) {
                    isOddPicked = true;
                    total += count;
                } else {
                    //otherwise take count ( odd ) - 1 ( i.e even) elements
                    total += (count - 1);
                }
            }
        }

        return total;
    }
}
