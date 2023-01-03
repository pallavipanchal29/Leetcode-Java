package array.easy;

public class FindHighestAltitude {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }

    public static int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int start = 0;
        for (int i = 0; i < gain.length; i++) {
            gain[i] = (i == 0) ? start + gain[i] : gain[i] + gain[i - 1];
            max = Math.max(max, gain[i]);
        }
        return Math.max(max, start);
    }
}
