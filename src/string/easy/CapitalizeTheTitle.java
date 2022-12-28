package string.easy;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("First leTTeR of EACH Word"));
    }

    public static String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() < 3)
                sb.append(word);
            else {
                sb.append(String.valueOf(word.charAt(0)).toUpperCase());
                sb.append(word.substring(1));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

