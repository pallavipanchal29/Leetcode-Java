package array.easy;

public class ReplaceElemWithGreatestElemOnRight {
    public static void main(String[] args) {
        int[] ans = replaceElements(new int[]{17, 18, 5, 4, 6, 1});
        for (int i : ans)
            System.out.print(i + " ");
    }

    public static int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            int t = arr[i];
            arr[i] = max;
            if (max < t)
                max = t;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
