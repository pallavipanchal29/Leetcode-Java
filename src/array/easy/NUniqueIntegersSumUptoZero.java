package array.easy;

public class NUniqueIntegersSumUptoZero {
    public static void main(String[] args) {
        int[] ans = sumZero(4);
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static int[] sumZero(int n) {
        int mid = n / 2;
        int[] ans = new int[n];
        int val = mid;
        if (n % 2 == 1) {
            for (int i = 0; i < mid; i++) {
                ans[i] = val * -1;
                val--;
            }
            ans[mid] = 0;
            val = mid;
            for (int i = n - 1; i >= mid + 1; i--) {
                ans[i] = val;
                val--;
            }
        } else {
            for (int i = 0; i < mid; i++) {
                ans[i] = val * -1;
                val--;
            }
            val = mid;
            for (int i = n - 1; i >= mid; i--) {
                ans[i] = val;
                val--;
            }
        }
        return ans;
    }
}
