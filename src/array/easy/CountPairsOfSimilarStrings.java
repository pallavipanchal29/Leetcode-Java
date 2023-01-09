package array.easy;

import java.util.Arrays;

public class CountPairsOfSimilarStrings {
    static boolean[][] arr;

    public static void main(String[] args) {
        System.out.println(similarPairs(new String[]{"aba", "aabb", "abcd", "bac", "aabc"}));
    }

    public static int similarPairs(String[] words) {
        int res = 0;
        arr = new boolean[words.length][26];
        for (int i = 0; i < words.length; ++i) {
            for (char ch : words[i].toCharArray()) arr[i][ch - 'a'] = true;
        }
        for (int i = 0; i < words.length; ++i) {
            for (int j = i + 1; j < words.length; ++j) {
                if (Arrays.equals(arr[i], arr[j]))
                    res += 1;
            }
        }
        return res;
    }
}
