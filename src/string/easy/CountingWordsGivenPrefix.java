package string.easy;

public class CountingWordsGivenPrefix {
    public static void main(String[] args) {
        System.out.println(prefixCount(new String[]{"pay", "attention", "practice", "attend"}, "at"));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (doStartWithPre(words[i], pref))
                count++;
        }
        return count;
    }

    static Boolean doStartWithPre(String wd, String prefix) {
        int i = 0;
        int j = 0;
        while (i < wd.length() & j < prefix.length()) {
            if (wd.charAt(i) != prefix.charAt(j)) return false;
            i++;
            j++;
        }
        return j == prefix.length();
    }
}
