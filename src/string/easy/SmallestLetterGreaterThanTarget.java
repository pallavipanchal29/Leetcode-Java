package string.easy;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        int mid = low + (high - low) / 2;
        while (low < high) {
            if (letters[mid] > target)
                high = mid - 1;
            else if (letters[mid] < target)
                low = mid + 1;
        }
        return letters[low % letters.length];
    }
}
