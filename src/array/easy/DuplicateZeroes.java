package array.easy;

public class DuplicateZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; ) {
            if (arr[i] == 0 && i < arr.length - 1) {

                for (int j = arr.length - 1; j > i + 1; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                i = i + 2;
            } else
                i++;

        }
    }
}
