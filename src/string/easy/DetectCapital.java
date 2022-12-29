package string.easy;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
    }

    public static boolean detectCapitalUse(String word) {
        int capital = 0;
        int ind = -1;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capital++;
                if (ind < 0)
                    ind = i;
            }
        }
        return capital == word.length() || (capital == 1 && ind == 0) || (capital == 0);
    }
}
