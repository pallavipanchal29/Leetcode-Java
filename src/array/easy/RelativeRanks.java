package array.easy;

import java.util.Arrays;

public class RelativeRanks {
    public static void main(String[] args) {
        String[] ans = findRelativeRanks(new int[]{5, 4, 3, 2, 1});
        for (String i : ans)
            System.out.print(i + " ");
    }

    public static String[] findRelativeRanks(int[] score) {
        int[] temp = new int[score.length];
        System.arraycopy(score, 0, temp, 0, score.length);

        Arrays.sort(temp);

        String[] answer = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int ind = BinarySearch(temp, 0, temp.length - 1, score[i]);

            if (ind == score.length - 1)
                answer[i] = "Gold Medal";
            else if (ind == score.length - 2)
                answer[i] = "Silver Medal";
            else if (ind == score.length - 3)
                answer[i] = "Bronze Medal";
            else
                answer[i] = String.valueOf(score.length - ind);
        }
        return answer;
    }

    private static int BinarySearch(int[] temp, int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (temp[mid] == key)
                return mid;
            else if (temp[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

}
