package string.easy;

public class GenerateStringwithCharacterWithOddCounts {
    public static void main(String[] args) {
        System.out.println(generateTheString(3));
    }

    public static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 1) // n is odd
        {
            while (n > 0) {
                sb.append('a');
                n--;
            }
        } else {
            //n is even
            while (n > 1) {
                sb.append('a');
                n--;
            }
            sb.append('b');
        }
        return sb.toString();
    }
}
