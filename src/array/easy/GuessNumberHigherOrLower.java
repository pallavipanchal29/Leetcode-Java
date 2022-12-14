package array.easy;

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    public static int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (guess(mid) == 0)
                return mid;
            else if (guess(mid) == -1)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    static int guess(int num) {
        int pick = 6;
        if (num == pick) return 0;
        else if (num > pick) return -1;
        else return 1;
    }
}
