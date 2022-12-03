package string.easy;

public class MaximumWordsFoundInSentence {
    public static void main(String[] args) {
        String[] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(arr));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sentences.length; i++) {
            int len = sentences[i].split(" ").length;
            max = Math.max(max, len);
        }
        return max;
    }
}
