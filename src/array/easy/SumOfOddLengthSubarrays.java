package array.easy;

//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/solutions/854184/java-c-python-o-n-time-o-1-space/
public class SumOfOddLengthSubarrays {
    public static void main(String[] args) {
        System.out.println(new int[]{1, 4, 2, 5, 3});
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int res = 0, n = arr.length;
        for (int i = 0; i < n; ++i) {
            res += ((i + 1) * (n - i) + 1) / 2 * arr[i];
        }
        return res;
    }
}
