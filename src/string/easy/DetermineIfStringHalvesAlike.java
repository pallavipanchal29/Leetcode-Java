package string.easy;

public class DetermineIfStringHalvesAlike {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("textbook"));
    }

    public static boolean halvesAreAlike(String s) {
        int count = 0;
        int mid = s.length() / 2;

        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i)))
                count++;
        }
        for (int i = mid; i < s.length(); i++) {
            if (isVowel(s.charAt(i)))
                count--;
        }
        return count == 0;
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".contains(String.valueOf(c));
    }
}
