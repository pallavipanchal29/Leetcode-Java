package string.easy;

public class GoatLatin {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }

    public static String toGoatLatin(String sentence) {
        String ma = "ma";
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        int count = 1;
        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].charAt(0))) {
                sb.append(words[i] + ma);
            } else {
                sb.append(words[i].substring(1) + words[i].charAt(0) + ma);
            }
            for (int j = 0; j < count; j++) {
                sb.append("a");
            }
            sb.append(" ");
            count++;
        }
        return sb.toString().trim();
    }

    static boolean isVowel(char c) {
        return "aeiouAEIOU".contains(String.valueOf(c));
    }
}
