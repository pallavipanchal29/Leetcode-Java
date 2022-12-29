package string.easy.hashtable;

public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("", "a"));
    }

    public static char findTheDifference(String s, String t) {
        int[] s1 = new int[26];
        int[] t1 = new int[26];
        for (int i = 0; i < s.length(); i++)
            s1[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            t1[t.charAt(i) - 'a']++;

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == t1[i])
                t1[i] = 0;
            else {
                return (char) (i + 'a');
            }
        }
        return ' ';
    }
}
