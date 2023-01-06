package string.easy;

//Incomplete
public class CountAsterisks {
    public static void main(String[] args) {
        System.out.println(countAsterisks("*||*|||||*|*|***||*||***|"));
    }

    public static int countAsterisks(String s) {
        int count = 0;
        int pair = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                if (pair == 0) {
                    pair++;
                } else if (pair > 0) {
                    pair = 0;
                }
            } else if (s.charAt(i) == '*' && pair == 0)
                count++;
        }
        return count;
    }
}
