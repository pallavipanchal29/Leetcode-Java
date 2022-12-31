package string.easy;

public class NumberOfConsistentStrings {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean isValid = true;
            char[] t = words[i].toCharArray();
            for (int j = 0; j < t.length; j++) {
                if (!allowed.contains(String.valueOf(t[j]))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid)
                count++;
        }
        return count;
    }
}
