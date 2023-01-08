package string.easy;

public class VerifyingAlienDictionary {
    static int[] value = new int[26];

    public static void main(String[] args) {
        String[] words = {"apple", "app"};
        System.out.println(isAlienSorted(words, "abcdefghijklmnopqrstuvwxyz"));
    }

    public static boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); i++) {
            value[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            if (isBigger(words[i - 1], words[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBigger(String first, String second) {
        int flen = first.length(), slen = second.length();
        for (int i = 0; i < flen && i < slen; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return value[first.charAt(i) - 'a'] > value[second.charAt(i) - 'a'];
            }
        }
        return flen > slen;
    }
}
