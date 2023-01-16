package greedy.easy;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("35427"));
    }

    public static String largestOddNumber(String num) {
        if (num.charAt(num.length() - 1) % 2 == 1) return num;
        int i = num.length() - 1;
        while (i >= 0) {
            if (num.charAt(i) % 2 == 1)
                break;
            i--;
        }
        return num.substring(0, i + 1);
    }
}
