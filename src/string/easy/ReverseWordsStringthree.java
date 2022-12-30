package string.easy;

public class ReverseWordsStringthree {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] temp = words[i].toCharArray();
            int m = 0;
            int n = temp.length - 1;
            while (m < n) {
                char t = temp[m];
                temp[m] = temp[n];
                temp[n] = t;
                m++;
                n--;
            }
            ans.append(String.valueOf(temp) + " ");
        }
        return ans.toString().trim();
    }
}
