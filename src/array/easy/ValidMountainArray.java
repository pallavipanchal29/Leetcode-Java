package array.easy;

public class ValidMountainArray {
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length >= 3) {
            int i = 0;
            int inc = 0;
            int dec = 0;
            while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                inc++;
                i++;
                if (inc == arr.length - 1) {
                    return false;
                }
            }
            while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
                dec++;
                i++;
                if (dec == arr.length - 1) {
                    return false;
                }
            }
            return inc + dec == arr.length - 1;
        }
        return false;
    }
}
