package string.easy;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] temp = s.toCharArray();
        while (i < j) {
            while (i < j && !isVowel(temp[i])) i++;
            while (i < j && !isVowel(temp[j])) j--;
            char c = temp[i];
            temp[i] = temp[j];
            temp[j] = c;
            i++;
            j--;
        }
        return String.valueOf(temp);
    }

    static boolean isVowel(char c) {
        return "aeiouAEIOU".contains(String.valueOf(c));
    }
}
