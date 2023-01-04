package array.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SubsequenceOfLengthKLargestSum {
    public static void main(String[] args) {
        int[] ans = maxSubsequence(new int[]{2, 1, 3, 3}, 2);
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] indexAndVal = new int[n][2];
        for (int i = 0; i < n; ++i) {
            indexAndVal[i] = new int[]{i, nums[i]};
        }
        // Reversely sort by value.
        Arrays.sort(indexAndVal, Comparator.comparingInt(a -> -a[1]));
        int[][] maxK = Arrays.copyOf(indexAndVal, k);
        // Sort by index.
        Arrays.sort(maxK, Comparator.comparingInt(a -> a[0]));
        int[] seq = new int[k];
        for (int i = 0; i < k; ++i) {
            seq[i] = maxK[i][1];
        }
        return seq;
    }

    public int[] maxSubsequencePriorityQueue(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> nums[i]));
        for (int i = 0; i < nums.length; ++i) {
            pq.offer(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.stream().sorted().mapToInt(i -> nums[i]).toArray();
    }
}
