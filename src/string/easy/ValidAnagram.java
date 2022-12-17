package string.easy;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        int[] count1 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count1[s.charAt(i) - 'a']++;
        }
        int[] count2 = new int[26];
        for (int i = 0; i < t.length(); i++) {
            count2[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < count1.length; i++) {
            if (count1[i] != count2[i])
                return false;
        }
        return true;
    }

}
