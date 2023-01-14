package string.easy.twopointers;

public class FirstPalindromicStringArray {
    public static void main(String[] args) {
        String[] w = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(firstPalindrome(w));
    }

    public static String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String wd = words[i];
            if (isPalindrome(wd))
                return wd;
        }
        return "";
    }

    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
